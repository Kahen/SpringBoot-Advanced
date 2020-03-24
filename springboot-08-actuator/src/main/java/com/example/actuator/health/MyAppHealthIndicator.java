package com.example.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-24 20:26
 */
@Component
public class MyAppHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        //自定义的检查方法
        //Health.up().build()代表健康

        return Health.down().withDetail("msg", "服务异常").build();
    }
}
