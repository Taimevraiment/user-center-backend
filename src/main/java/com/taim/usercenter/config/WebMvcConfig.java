package com.taim.usercenter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * author: taim
 * createTime: 2023/6/24
 */
//@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://usercenter.taim.site", "http://localhost:8000")
                .allowCredentials(true)
                .allowedMethods("*")
                .maxAge(1728000L);
    }
}
