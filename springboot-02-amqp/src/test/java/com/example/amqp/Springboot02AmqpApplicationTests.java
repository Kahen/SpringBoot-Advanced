package com.example.amqp;

import com.example.amqp.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot02AmqpApplicationTests {
    @Resource
    RabbitTemplate rabbitTemplate;
    @Resource
    AmqpAdmin amqpAdmin;

    @Test
    public void createExchange() {
        // amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
        // amqpAdmin.declareQueue(new Queue("amqpadmin.queue"));
        amqpAdmin.declareBinding(new Binding("amqpadmin.queue", Binding.DestinationType.QUEUE, "amqpadmin.exchange",
                "amqpadmin.hh", null));
        System.out.println("创建完成");
    }

    /**
     * 1. 单播 （点对点）
     */
    @Test
    void contextLoads() {
        //    Message需要自己构造一个；定义消息体内容和消息头
        //    rabbitTemplate.send(exchange,routeKey,message);

        //    object 默认当成消息体，只需要传入要发送的对象，自动序列化发送给rabbitmq；
        //     rabbitTemplate.convertAndSend(exchange,routeKey,Object);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "这是第一个消息");
        map.put("data", Arrays.asList("helloworld", 123, true));
        rabbitTemplate.convertAndSend("exchange.direct", "atguigu.news", new Book("西游记", "吴承恩"));
    }

    @Test
    public void receive() {
        Object receiveAndConvert = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(receiveAndConvert.getClass());
        System.out.println(receiveAndConvert);
    }

    /**
     * 广播
     */
    @Test
    public void sendMsg() {
        rabbitTemplate.convertAndSend("exchange.fanout", "", new Book("红楼梦", "曹雪芹"));
        System.out.println();
    }
}
