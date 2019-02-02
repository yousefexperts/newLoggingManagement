package com.experts.core.biller.statemachine.api.auth;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

import javax.sql.DataSource;

/*import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;*/
/*import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;*/
/*import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;*/

@EnableJdbcHttpSession
@Configuration
@EnableResourceServer
@PropertySource("classpath:application.properties")
public class AuthServer extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "resource_id";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/ws/**").permitAll()
				.antMatchers("/oauth/**").permitAll()
				.antMatchers("/ws/**").permitAll()
				.antMatchers("/swagger-ui.html").permitAll()
				.antMatchers("/ws/BillPullRequest/**").permitAll()
				.antMatchers("/ws/NotificationRequest/**").permitAll()
				.antMatchers("/ws/PrePaidRequest/**").permitAll()
				.antMatchers("/ws/PaymentRequest/**").permitAll()
				.antMatchers("/ws/InquiryRequest/**").permitAll()
				.and()
				.authorizeRequests().
				antMatchers("/ws/BillPullRequest").permitAll()
				.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}
}