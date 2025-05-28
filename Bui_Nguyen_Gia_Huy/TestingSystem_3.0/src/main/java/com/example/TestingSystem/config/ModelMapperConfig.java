package com.example.TestingSystem.config;

import com.example.TestingSystem.dto.AccountDTO;
import com.example.TestingSystem.entity.Account;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<Account, AccountDTO>() {
            @Override
            protected void configure() {
                map().setDepartmentName(source.getDepartment().getDepartmentName());
                // Simple and clean - ModelMapper handles enum to string automatically
                map(source.getPosition().getPositionName(), destination.getPositionName());
            }
        });

        return modelMapper;
    }
}


