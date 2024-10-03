package com.example.spring.core.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class swimConfig {
    @Bean
    public Coach swimCoach(){
    return new swimCoach();
    }
}

