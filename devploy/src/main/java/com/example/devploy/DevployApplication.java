package com.example.devploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kahen
 * 在pom或者启动时引入spring devtools 开启热部署
 */
@SpringBootApplication
public class DevployApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevployApplication.class, args);
    }

}
