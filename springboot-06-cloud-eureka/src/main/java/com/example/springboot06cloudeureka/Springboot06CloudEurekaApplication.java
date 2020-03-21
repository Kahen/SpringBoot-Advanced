package com.example.springboot06cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Kahen
 * 注册中心
 * 1、配置Eureka信息
 * 2、@EnableEurekaServer
 */
@EnableEurekaServer
@SpringBootApplication
public class Springboot06CloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06CloudEurekaApplication.class, args);
    }

}
