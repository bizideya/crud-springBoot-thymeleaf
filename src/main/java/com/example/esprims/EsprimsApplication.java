package com.example.esprims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@Configuration
@EnableSwagger2
//@ComponentScan(basePackages = "com.example.esprims.controller")


public class  EsprimsApplication {

    public static void main(String[] args) {

        SpringApplication.run(EsprimsApplication.class, args);
    }

}
