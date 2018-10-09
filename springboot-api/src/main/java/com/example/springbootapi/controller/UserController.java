package com.example.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 海仔
 * @Date: 2018/10/9 0009 21:56
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        String forObject = restTemplate.getForObject("http://SPRINGBOOT-DATACENTER/ticket", String.class);
        return name + "买票了 :" + forObject;
    }

}
