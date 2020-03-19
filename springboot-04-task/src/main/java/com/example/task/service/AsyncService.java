package com.example.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-19 9:13
 */
@Service
public class AsyncService {
    /**
     * 告诉Spring这是一个异步方法
     */
    @Async
    public void hello() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中");
    }
}
