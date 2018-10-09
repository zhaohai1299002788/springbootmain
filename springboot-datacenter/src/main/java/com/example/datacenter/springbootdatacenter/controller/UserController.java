package com.example.datacenter.springbootdatacenter.controller;

import com.example.datacenter.springbootdatacenter.service.TickeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 海仔
 * @Date: 2018/10/9 0009 22:05
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private TickeService tickeService;

    @GetMapping("ticket")
    public String getTicket() {
        return tickeService.getTicket();
    }

}
