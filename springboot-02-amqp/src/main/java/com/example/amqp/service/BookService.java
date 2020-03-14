package com.example.amqp.service;

import com.example.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-14 21:18
 */
@Service
public class BookService {
    @RabbitListener(queues = "atguigu.news")
    public void receive(Book book) {
        System.out.println("收到消息:" + book);
    }

    @RabbitListener(queues = "atguigu")
    public void receive02(Message message) {
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
