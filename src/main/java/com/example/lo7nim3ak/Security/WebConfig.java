package com.example.lo7nim3ak.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")

                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                        .allowedOrigins("*") // Frontend URL
                        .allowedHeaders("*");
            }
        };
    }
}
