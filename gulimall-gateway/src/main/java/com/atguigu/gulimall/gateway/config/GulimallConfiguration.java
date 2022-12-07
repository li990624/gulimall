package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GulimallConfiguration {

        @Bean
        public CorsWebFilter corsWebFilter() {
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            CorsConfiguration config = new CorsConfiguration();
            //1.配置跨域
            //允许那些请求头可以跨域
            config.addAllowedHeader("*");
            //允许那些请求方式get,post,put,delete
            config.addAllowedMethod("*");
            //允许那些域名可以跨域
            //config.addAllowedOrigin("*");
            config.addAllowedOriginPattern("*");
            //允许携带cookie跨域
            config.setAllowCredentials(true);
            source.registerCorsConfiguration("/**",config);
            return new CorsWebFilter(source);
        }
    }
