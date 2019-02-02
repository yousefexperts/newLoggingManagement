package com.experts.core.biller.statemachine.api.auth;

import java.security.KeyPair;

import com.experts.core.biller.statemachine.api.activemq.standers.config.CustomerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
/*import org.springframework.boot.actuate.autoconfigure.ManagementServerProperties;*/
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@SessionAttributes("authorizationRequest")
@Import({CustomerConfig.class , WebSecurityConfig.class})
public class AuthserverApplication extends WebMvcConfigurerAdapter {

	




	@Configuration
	@EnableAuthorizationServer
	protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter {

		static final String CLIEN_ID = "experts-client";
		static final String CLIENT_SECRET = "experts-secret";
		static final String GRANT_TYPE_PASSWORD = "experts#opc@#2018$123";
		static final String AUTHORIZATION_CODE = "authorization_code";
		static final String REFRESH_TOKEN = "refresh_token";
		static final String IMPLICIT = "implicit";
		static final String SCOPE_READ = "read";
		static final String SCOPE_WRITE = "write";
		static final String TRUST = "trust";
		static final int ACCESS_TOKEN_VALIDITY_SECONDS = 1*60*60;
		static final int FREFRESH_TOKEN_VALIDITY_SECONDS = 6*60*60;

		/*@Autowired
		private AuthenticationManager authenticationManager;*/

		@Bean
		public JwtAccessTokenConverter accessTokenConverter() {
			JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
			converter.setSigningKey("as466gf");
			return converter;
		}

		@Bean
		public TokenStore tokenStore() {
			return new JwtTokenStore(accessTokenConverter());
		}

		@Override
		public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {

			configurer
					.inMemory()
					.withClient(CLIEN_ID)
					.secret(CLIENT_SECRET)
					.authorizedGrantTypes(GRANT_TYPE_PASSWORD, AUTHORIZATION_CODE, REFRESH_TOKEN, IMPLICIT )
					.scopes(SCOPE_READ, SCOPE_WRITE, TRUST)
					.accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS).
					refreshTokenValiditySeconds(FREFRESH_TOKEN_VALIDITY_SECONDS);
		}

	/*	@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
			endpoints.tokenStore(tokenStore())
					.authenticationManager(authenticationManager)
					.accessTokenConverter(accessTokenConverter());
		}*/

	}
}
