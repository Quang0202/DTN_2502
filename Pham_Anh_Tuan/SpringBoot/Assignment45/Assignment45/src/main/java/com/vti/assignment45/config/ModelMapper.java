package com.vti.assignment45.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {

    @Bean
    public org.modelmapper.ModelMapper initModeMapper(){
        return new org.modelmapper.ModelMapper();
    }
}
