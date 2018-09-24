package com.example.datacenter.springbootdatacenter.config;

import com.example.datacenter.springbootdatacenter.snowflake.SnowflakeIdFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 海仔
 * @Date: 2018/9/24 0024 21:32
 * @Version 1.0
 */
@Configuration
public class BeanConfig {

    //@Bean
    public SnowflakeIdFactory getSnowflakeId(SnowflakeIdFactory snowflakeIdFactory) {
        return snowflakeIdFactory;
    }

}
