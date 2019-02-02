package com.experts.core.biller.statemachine.api.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /*@Autowired
    private UserDetailsService userDetailsService;*/


    @Override
    protected void configure(HttpSecurity http) throws Exception {



        http
                .csrf().disable()

                .authorizeRequests()




                .antMatchers("/swagger-ui.html").permitAll()
                .antMatchers("/ws/**").permitAll()
                .antMatchers("/ws/BillPullRequest/**").permitAll()
                .antMatchers("/ws/NotificationRequest/**").permitAll()
                .antMatchers("/ws/PrePaidRequest/**").permitAll()
                .antMatchers("/ws/PaymentRequest/**").permitAll()
                .antMatchers("/ws/InquiryRequest/**").permitAll()
                .anyRequest().permitAll();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      /*  auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());*/
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

}