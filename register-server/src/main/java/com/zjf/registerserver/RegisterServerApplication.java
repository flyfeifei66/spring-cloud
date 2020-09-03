package com.zjf.registerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterServerApplication.class, args);
        System.out.println("eureka server启动成功");
    }
}
