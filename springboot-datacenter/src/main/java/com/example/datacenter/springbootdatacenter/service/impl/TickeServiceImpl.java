package com.example.datacenter.springbootdatacenter.service.impl;

import com.example.datacenter.springbootdatacenter.service.TickeService;
import org.springframework.stereotype.Service;

/**
 * @Author: 海仔
 * @Date: 2018/10/9 0009 21:19
 * @Version 1.0
 */
@Service
public class TickeServiceImpl implements TickeService {
    @Override
    public String getTicket() {
        return "电影票";
    }
}
