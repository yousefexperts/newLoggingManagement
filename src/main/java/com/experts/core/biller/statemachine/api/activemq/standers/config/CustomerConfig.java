package com.experts.core.biller.statemachine.api.activemq.standers.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.atomikos.jms.AtomikosConnectionFactoryBean;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.artemis.jms.client.ActiveMQXAConnectionFactory;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.apache.commons.dbcp2.BasicDataSource;
import org.postgresql.xa.PGXADataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.jms.ConnectionFactory;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = {"com.experts.core.biller.statemachine.api.repo"})
@EnableTransactionManagement
public class CustomerConfig {

    @Autowired
    private JpaVendorAdapter jpaVendorAdapter;

	/*@Value("${dataSource.url:jdbc:oracle:thin:@192.168.10.9:1251/dv10g}")
	private String dataSourceUrl;

	@Value("${dataSource.user:billmain}")
	private String dataSourceUser;

	@Value("${dataSource.password:billmain}")
	private String dataSourcePassword;*/

    @Bean
    @Primary
    public DataSource dataSource() {
        PGXADataSource pgXADatasource = new PGXADataSource();
        pgXADatasource.setUrl("jdbc:postgresql://localhost:5432/jta-latest");
        pgXADatasource.setUser("root");
        pgXADatasource.setPassword("opc@2018");
        AtomikosDataSourceBean xaDataSourceBean = new AtomikosDataSourceBean();
        xaDataSourceBean.setXaDataSource(pgXADatasource);
        xaDataSourceBean.setUniqueResourceName(DistTxConstants.UNIQUE_RESOURCE_NAME_DATASOURCE);
        xaDataSourceBean.setMinPoolSize(10);
        xaDataSourceBean.setMaxPoolSize(40);
        return xaDataSourceBean;
    }

    @Bean
    @Primary
    public ConnectionFactory connectionFactory() throws Exception {
        BrokerService brokerService = new BrokerService();
        brokerService.setPersistent(false);
        brokerService.setUseJmx(false);
        brokerService.setAdvisorySupport(false);
        brokerService.setSchedulerSupport(false);
        TransportConnector connector = brokerService.addConnector("vm://localhost");
        brokerService.start();
        String connectionUri = connector.getPublishableConnectString();
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(connectionUri);
        ActiveMQXAConnectionFactory activeMQXAConnectionFactory = new ActiveMQXAConnectionFactory(connectionUri);
        activeMQXAConnectionFactory.setUser(DistTxConstants.USERNAME);
        activeMQXAConnectionFactory.setPassword(DistTxConstants.PASSWD);
        AtomikosConnectionFactoryBean atomikosConnectionFactoryBean = new AtomikosConnectionFactoryBean();
        atomikosConnectionFactoryBean.setUniqueResourceName(DistTxConstants.UNIQUE_RESOURCE_NAME_MESSAGE_QUEUE);
        atomikosConnectionFactoryBean.setLocalTransactionMode(false);
        atomikosConnectionFactoryBean.setXaConnectionFactory(activeMQXAConnectionFactory);
        atomikosConnectionFactoryBean.setMinPoolSize(25);
        atomikosConnectionFactoryBean.setMaxPoolSize(50);
        return atomikosConnectionFactoryBean;
    }

    @Bean("transactionManager")
    @Primary
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
	
	/*@Bean("transactionManagerMain")
	@Order(-3)
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}*/

    private Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        return properties;
    }

	/*@Bean(name = "dataSource")
	@Primary
	public DataSource dataSource() throws SQLException {
		BasicDataSource oracleXADataSource = new BasicDataSource();
		oracleXADataSource.setUsername("billmain");
		oracleXADataSource.setPassword("billmain");
		oracleXADataSource.setUrl("jdbc:oracle:thin:@192.168.10.9:1251/dv10g");
		return oracleXADataSource;
	}*/


    /*@Bean("entityManagerFactory")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws SQLException {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setShowSql(true);
		hibernateJpaVendorAdapter.setDatabase(Database.ORACLE);
		final LocalContainerEntityManagerFactoryBean build = new LocalContainerEntityManagerFactoryBean();
		//*build.setPackagesToScan("oracle.pack.entity");*//*
		build.setPersistenceUnitName("EXPERTS-UNIT-LATEST");
		build.setPersistenceXmlLocation("classpath:META-INF/persistence-dev.xml");
		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.transaction.jta.platform", AtomikFactoryBean.class.getName());
		properties.put("javax.persistence.transactionType", "JTA");
		build.setJtaDataSource(dataSource());
		build.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		return build;
	}*/

    @Bean("entityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws SQLException {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setDatabase(Database.POSTGRESQL);
        final LocalContainerEntityManagerFactoryBean build = new LocalContainerEntityManagerFactoryBean();
        build.setPackagesToScan("com.experts.core.biller.statemachine.api.model.domain.jpa");
        build.setPersistenceUnitName("EXPERTS-UNIT");
        build.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
        HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.transaction.jta.platform", AtomikFactoryBean.class.getName());
        properties.put("javax.persistence.transactionType", "JTA");
        build.setJtaDataSource(dataSource());
        build.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        return build;
    }

    @Bean
    public JpaVendorAdapter hibernateJpaVendorAdapter() {
        final HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
        jpaAdapter.setShowSql(true);
        return jpaAdapter;
    }

    private Properties additionalPropertiesOracle() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        properties.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
        return properties;
    }


}
