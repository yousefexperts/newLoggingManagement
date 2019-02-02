package com.experts.core.biller.statemachine.api.order;

import java.util.EnumSet;

import com.experts.core.biller.statemachine.api.StateMachineEventListener;
import com.experts.core.biller.statemachine.api.constants.Events;
import com.experts.core.biller.statemachine.api.constants.States;
import com.experts.core.biller.statemachine.api.monitor.TestStateMachineMonitor;
import lombok.Builder;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.target.CommonsPool2TargetSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.boot.jdbc.DataSourceBuilder;*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
/*import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;*/
import org.springframework.messaging.Message;
/*import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;*/
import org.springframework.statemachine.ExtendedState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
/*import org.springframework.statemachine.data.redis.RedisStateMachineContextRepository;
import org.springframework.statemachine.data.redis.RedisStateMachinePersister;*/
import org.springframework.statemachine.guard.Guard;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.monitor.StateMachineMonitor;
import org.springframework.statemachine.persist.RepositoryStateMachinePersist;
import org.springframework.statemachine.state.State;

import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.support.StateMachineInterceptor;
import org.springframework.statemachine.transition.Transition;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@Slf4j
@EnableStateMachine
/*@EnableWebSecurity*/
@EnableWebMvc
/*@EnableGlobalMethodSecurity(securedEnabled = true)*/
public class OrderStateMachineConfiguration extends EnumStateMachineConfigurerAdapter<OrderState, OrderEvent> {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(OrderStateMachineConfiguration.class);

	
    @Autowired
    private StateMachine<States, Events> stateMachineTarget;

    @Bean
    public  StateMachine<States, Events> stateMachineTarget() throws Exception {

        StateMachineBuilder.Builder<States, Events> builder = StateMachineBuilder.builder();

        builder.configureConfiguration()
                .withConfiguration()
                .machineId("billerCoreEngineFSM")
                ;

        builder.configureStates()
                .withStates()
                .initial(States.STAND)
                .state(States.STAND).state(States.RECEIVEREQUEST).state(States.PAY).state(States.PROCESSING).state(States.WAITING).state(States.COMPLETED).state(States.CANCEL);
        builder.configureTransitions()
                .withExternal()
                .source(States.STAND)
                .target(States.RECEIVEREQUEST)
                .event(Events.EVENTBEGIN).and().withExternal().source(States.RECEIVEREQUEST).target(States.PAY).event(Events.EVENTPROCESSING).action(securedAction()).secured("hasRole(ROLE_USER)").and()
                .withExternal()
                .source(States.PAY).target(States.WAITING).event(Events.EVENTWAIT).action(securedAction()).secured("hasRole(ROLE_USER)").and().withExternal().source(States.WAITING).target(States.COMPLETED)
                .event(Events.EVENTCOMPLETED).action(securedAction()).secured("hasRole(ROLE_USER)").and().withExternal().source(States.COMPLETED).target(States.CANCEL).event(Events.EVENTCANCEL).action(securedAction()).secured("hasRole(ROLE_USER)");
       /* builder.build().start();*/
        return builder.build();
    }

    /*@Bean
    @Scope("singleton")
    public DataSource dSource(){
     DataSource   dataSource_ =  DataSourceBuilder.create().password("billmain").username("billmain").url("jdbc:oracle:thin:@192.168.10.9:1251/DV10G").driverClassName("oracle.jdbc.driver.OracleDriver").build();
     return dataSource_;
    }*/


    /*@Bean

    public ProxyFactoryBean stateMachine() {
        ProxyFactoryBean pfb = new ProxyFactoryBean();
        pfb.setTargetSource(poolTargetSource());
        return pfb;
    }*/

    /*@Bean
    public CommonsPool2TargetSource poolTargetSource() {
        CommonsPool2TargetSource pool = new CommonsPool2TargetSource();
        pool.setMaxSize(3);
        pool.setTargetBeanName("stateMachineTarget");
        return pool;
    }*/


  /*  public void interceptorStateMachineConfiguration(){
        stateMachineTarget.getStateMachineAccessor()
                .withRegion().addStateMachineInterceptor(new StateMachineInterceptor<States, Events>() {


            @Override
            public void preStateChange(State<States, Events> state, Message<Events> message, Transition<States, Events> transition, StateMachine<States, Events> stateMachine) {
                System.out.printf("Interceptor - preState : %s\n", state.getId());

            }

            @Override
            public void postStateChange(State<States, Events> state, Message<Events> message, Transition<States, Events> transition, StateMachine<States, Events> stateMachine) {
                System.out.printf("Interceptor - postState : %s\n", state.getId());

            }

            @Override
            public StateContext<States, Events> preTransition(StateContext<States, Events> stateContext) {
                return stateContext;
            }


            @Override
            public StateContext<States, Events> postTransition(StateContext<States, Events> stateContext) {
                return stateContext;
            }


            @Override
            public Exception stateMachineError(StateMachine<States, Events> stateMachine,
                                               Exception exception) {
                return exception;
            }

            @Override
            public Message<Events> preEvent(Message<Events> message, StateMachine<States, Events> stateMachine) {
                return message;
            }
        });
    }*/
    @Bean
    public StateMachineEventListener stateMachineEventListener() {

        StateMachineEventListener listener = new StateMachineEventListener();
        stateMachineTarget.addStateListener(listener);
        return listener;
    }

    @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
    @Bean
    public Action<States , Events> securedAction() {
        return new Action<States , Events>() {

           /* @Secured("ROLE_ANONYMOUS")*/
            @Override
            public void execute(StateContext<States , Events> context) {
            }
        };
    }

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("admin").roles("USER");
    }*/



    /*@Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory();
    }*/

    /*@Bean
    public StateMachineMonitor<States, Events> stateMachineMonitor() {
        return new TestStateMachineMonitor();
    }*/

    /*@Bean
    public StateMachinePersist<States, Events, String> stateMachinePersist(RedisConnectionFactory connectionFactory) {
        RedisStateMachineContextRepository<States, Events> repository =
                new RedisStateMachineContextRepository<States, Events>(connectionFactory);
        return new RepositoryStateMachinePersist<>(repository);
    }*/

    /*@Bean
    public RedisStateMachinePersister<States, Events> redisStateMachinePersister(
            StateMachinePersist<States, Events, String> stateMachinePersist) {
        return new RedisStateMachinePersister<States, Events>(stateMachinePersist);
    }*/

    @Override
    public void configure(StateMachineStateConfigurer<OrderState, OrderEvent> states)
            throws Exception {
        states
            .withStates()
                .initial(OrderState.OpenTicket, context -> setUnpaid(context.getExtendedState()))
                .states(EnumSet.allOf(OrderState.class));
    }

    public StateMachineListener<OrderState, OrderEvent> loggingListener() {
        return new StateMachineListenerAdapter<OrderState, OrderEvent>() {
            @Override
            public void stateChanged(State<OrderState, OrderEvent> from, State<OrderState, OrderEvent> to) {
                log.info("State changed to {}", to.getId());
            }
            @Override
            public void eventNotAccepted(Message<OrderEvent> event) {
                log.error("Event not accepted: {}", event.getPayload());
            }
        };
    }


/**
+----------------------------------------------------------------------------------------------------------------------------+
|                                                     pre-payment flow                                                       |
+----------------------------------------------------------------------------------------------------------------------------+
|                                (1)                            (2) [if paid]                 (3)                            |
|     +------------------+ ReceivePayment  +-- ---------------+  Deliver +------------------+  Refund  +------------------+  |
| *-->|       Open       |---------------->| ReadyForDelivery |--------->|    CompletedState     |--------->|     Canceled     |  |
|     |                  |                 |                  |          |                  |          |                  |  |
|     |                  |                 |  ReceivePayment  |          |                  |          |  ReceivePayment  |  |
|     |                  |                 |  +------------+  |          |                  |          |  +------------+  |  |
|     |                  |                 |  |    (11)    |  |          |                  |          |  |    (12)    |  |  |
|     |                  |                 |  |            v  |          |                  |          |  |            v  |  |
|     +------------------+                 +------------------+          +------------------+          +------------------+  |
|        | ^                                             | |         [if paid] (4) Refund                ^   ^       | ^     |
|        | |                                             | +---------------------------------------------+   |       | |     |
|        | |                                             |                                                   |       | |     |
|        | |                                             |           [if !paid]  (8) Cancel                  |       | |     |
|        | |           (5) Reopen                        +---------------------------------------------------+       | |     |
|        | +---------------------------------------------------------------------------------------------------------+ |     |
|        |                                              (6) Cancel                                                     |     |
|        +-------------------------------------------------------------------------------------------------------------+     |
|                                                                                                                            |
+----------------------------------------------------------------------------------------------------------------------------+


+-------------------------------------------------------------------------------------------------------------------------------------------------------------+
|                                                                     post-payment flow                                                                       |
+-------------------------------------------------------------------------------------------------------------------------------------------------------------+
|                                (7)                            (9) [if !paid]                 (10)                            (3)                            |
|     +------------------+ UnlockDelivery  +-- ---------------+  Deliver +------------------+ ReceivePayment +---------------+  Refund  +------------------+  |
| *-->|       Open       |---------------->| ReadyForDelivery |--------->| AwaitingPayment  |--------------->|   CompletedState   |--------->|     Canceled     |  |
|     |                  |                 |                  |          |                  |                |               |          |                  |  |
|     |                  |                 |  ReceivePayment  |          |                  |                |               |          |  ReceivePayment  |  |
|     |                  |                 |  +------------+  |          |                  |                |               |          |  +------------+  |  |
|     |                  |                 |  |    (11)    |  |          |                  |                |               |          |  |    (12)    |  |  |
|     |                  |                 |  |            v  |          |                  |                |               |          |  |            v  |  |
|     +------------------+                 +------------------+          +------------------+                +---------------+          +------------------+  |
|        | ^                                             |  |          [if paid] (4) Refund                                               ^    ^      | ^     |
|        | |                                             |  +-----------------------------------------------------------------------------+    |      | |     |
|        | |                                             |                                                                                     |      | |     |
|        | |                                             |             [if !paid] (8) Cancel                                                   |      | |     |
|        | |           (5) Reopen                        +-------------------------------------------------------------------------------------+      | |     |
|        | +------------------------------------------------------------------------------------------------------------------------------------------+ |     |
|        |                                              (6) Cancel                                                                                      |     |
|        +----------------------------------------------------------------------------------------------------------------------------------------------+     |
|                                                                                                                                                             |
+-------------------------------------------------------------------------------------------------------------------------------------------------------------+
*/
    @Override
    public void configure(StateMachineTransitionConfigurer<OrderState, OrderEvent> transitions)
            throws Exception {
        transitions
            .withExternal()
            // (1)
                .source(OrderState.OpenTicket)
                .target(OrderState.RECEIVEREQUEST)
                .event(OrderEvent.ReceivePayment)
                .action(receivePayment())
            .and()
            // (2)
            .withExternal()
                .source(OrderState.RECEIVEREQUEST)
                .target(OrderState.Waiting)
                .guard(isPaid())
                .event(OrderEvent.Deliver)
            .and()
            // (3)
            .withExternal()
                .source(OrderState.Waiting)
                .target(OrderState.EventProcessing)
                .guard(isPaid())
                .event(OrderEvent.Refund)
                .action(refundPayment())
            .and()
            // (4)
            .withExternal()
                .source(OrderState.EventProcessing)
                .target(OrderState.Completed)
                .event(OrderEvent.Refund)
                .action(refundPayment())
            .and()
            // (5)
            .withExternal()
                .source(OrderState.Completed)
                .target(OrderState.Canceled)
                .event(OrderEvent.Reopen)
            .and()

            ;
    }

    public Action<OrderState, OrderEvent> receivePayment() {
        return context -> setPaid(context.getExtendedState());
    }

    public Action<OrderState, OrderEvent> refundPayment() {
        return context -> setUnpaid(context.getExtendedState());
    }

    private Guard<OrderState, OrderEvent> isPaid() {
        return context -> 
            (boolean) context.getExtendedState().get("paid", Boolean.class);
    }

    private Guard<OrderState, OrderEvent> not(Guard<OrderState, OrderEvent> guard) {
        return context -> !guard.evaluate(context);
    }

    void setUnpaid(ExtendedState extendedState) {
        log.info("Unsetting paid");
        extendedState.getVariables().put("paid", Boolean.FALSE);
    }

    void setPaid(ExtendedState extendedState) {
        log.info("Setting paid");
        extendedState.getVariables().put("paid", Boolean.TRUE);
    }

}
