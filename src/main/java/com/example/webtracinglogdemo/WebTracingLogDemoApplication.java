package com.example.webtracinglogdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebTracingLogDemoApplication {

    Logger logger = LoggerFactory.getLogger(WebTracingLogDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebTracingLogDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public void hello() {
        logger.info("hello");
        throw new RuntimeException();
    }

}
