package com.zjf.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${server.port}")
    String port;

    @GetMapping("/get")
    public String getMessage(@RequestParam("name") String name) {
        String s = "Hi " + name + " ，I am from port:" + port;
        System.out.println(s);
        return s;
    }
}
