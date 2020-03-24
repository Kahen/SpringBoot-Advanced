package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
        Runnable runnable2=()->System.out.println("Running from Lambda");
        System.out.println(runnable2.getClass());
        System.out.println(runnable2);
    }

}
