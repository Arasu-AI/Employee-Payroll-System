package com.payroll.Zuci.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500") // Update this with your frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Add the HTTP methods you want to allow
                .allowedHeaders("*"); // Allow all headers
    }
}