package com.example.springbootapi.controller;

import com.example.springbootutils.utils.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 */
@RestController
public class TestController {

    /**
     * 测试获取时间
     * @return
     */
    @GetMapping("date")
    public String getDate() {
        Date date = DateUtils.getDate();
        // 设置日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "当前时间 ： " + simpleDateFormat.format(date);
    }

}
