package com.itmuch.cloud.study.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

@Configuration
public class OAuth2ServerConfig {

    @Configuration
    @EnableResourceServer
    protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

        @Value("${security.oauth2.resource.id}")
        private String resourceIds;

        private static final String[] AUTH_WHITELIST = {
                "/**/v2/api-docs",
                "/swagger-resources",
                "/swagger-resources/**",
                "/configuration/ui",
                "/configuration/security",
                "/swagger-ui.html",
                "swagger-resources/configuration/ui",
                "/doc.html",
                "/webjars/**"
        };

        @Override
        public void configure(HttpSecurity http) throws Exception {
            for (String au:AUTH_WHITELIST) {
                http.authorizeRequests().antMatchers(au).permitAll();
            }
            // @formatter:off
            http
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                    .and()
                    .requestMatchers().anyRequest()
                    .and()
                    .anonymous()
                    .and()
                    .authorizeRequests()
                    .antMatchers(resourceIds).authenticated();//配置order访问控制，必须认证过后才可以访问
            // @formatter:on
        }
    }


    @Configuration
    @EnableAuthorizationServer
    protected class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

        @Autowired
        AuthenticationManager authenticationManager;
        @Autowired
        private DataSource dataSource;

        @Primary
        @Bean
        public TokenStore tokenStore() {
            return new JdbcTokenStore(dataSource);
        }

        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.withClientDetails(clientDetails());
        }

        @Primary
        @Bean
        public AuthorizationServerTokenServices tokenServices() {
            DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
            defaultTokenServices.setAccessTokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(30)); // 30天
            defaultTokenServices.setRefreshTokenValiditySeconds(-1);
            defaultTokenServices.setSupportRefreshToken(true);
            defaultTokenServices.setReuseRefreshToken(false);
            defaultTokenServices.setTokenStore(tokenStore());
            defaultTokenServices.setClientDetailsService(clientDetails());
//            tokenServices.setTokenEnhancer(endpoints.getTokenEnhancer());
            return defaultTokenServices;
        }

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            //datasource存储token方案
            endpoints.authenticationManager(authenticationManager);
            endpoints.tokenStore(tokenStore());
            // 配置TokenServices参数
            endpoints.tokenServices(tokenServices());
        }

        @Override
        public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
            //        oauthServer.checkTokenAccess("isAuthenticated()");
            oauthServer.checkTokenAccess("permitAll()");
            //允许表单认证
            oauthServer.allowFormAuthenticationForClients();
        }
        @Bean
        public ClientDetailsService clientDetails() {
            return new JdbcClientDetailsService(dataSource);
        }

    }


}
