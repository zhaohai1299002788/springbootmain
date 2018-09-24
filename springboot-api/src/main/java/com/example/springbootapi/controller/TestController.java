package com.example.springbootapi.controller;

import com.example.springbootutils.utils.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 */
@Slf4j
@Api(value = "/测试Controller")
@RestController
public class TestController {

    /**
     * 测试获取时间
     *
     * @return
     */
    @ApiOperation(value = "展示首页信息", notes = "展示首页信息")
    @GetMapping("date")
    public String getDate() {
        Date date = DateUtils.getDate();
        // 设置日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (log.isInfoEnabled()) {
            log.info("getDate | simpleDateFormat : {}", simpleDateFormat.format(date));
        }
        return "当前时间 ： " + simpleDateFormat.format(date);
    }

}
