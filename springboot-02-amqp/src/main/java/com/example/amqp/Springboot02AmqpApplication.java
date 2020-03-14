package com.example.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kahen
 * 自动配置
 * 1、RabbitAutoConfiguration
 * 2、有了自动配置连接工厂ConnectionFactory
 * 3、RabbitProperties 封装了RabbitMQ 的配置
 * 4、RabbitTemplate ： 给RabbitMQ发送和接收消息
 * 5、AmqpAdmin ： RabbitMQ系统管理功能组件
 */
@SpringBootApplication
public class Springboot02AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02AmqpApplication.class, args);
    }

}
