package com.acitivi;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@EnableAutoConfiguration
@ComponentScan(value = {"com.acitivi" })
@MapperScan(basePackages = "com.acitivi.dao")
public class App {
    
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}