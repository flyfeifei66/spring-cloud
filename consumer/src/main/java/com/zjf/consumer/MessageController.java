package com.zjf.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 */
@RestController
public class MessageController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/show")
    public String showMessage(@RequestParam String name) {
        String s = restTemplate.getForObject("http://producer/get?name=" + name, String.class);
        System.out.println(s);
        return s;
    }
}
