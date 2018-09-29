package com.example.springbootapi.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: 海仔
 * @Date: 2018/9/29 0029 20:48
 * @Version 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    /**
     * 操作 K-V都是对象的
     */
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 操作 K-V都是字符串的
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<Object, Object> empRedisTemplate;

    /**
     * Redis ： 常见的五大数据类型
     * String（字符串），List（列表），Set（集合），Hash(散列），ZSet（有序集合)
     * stringRedisTemplate.opsForValue()[Stirng(字符串)]
     * stringRedisTemplate.opsForList()[List(列表)]
     * stringRedisTemplate.opsForSet()[Set(集合)]
     * stringRedisTemplate.opsForHash()[Hash(散列)]
     * stringRedisTemp;ate.opsForZSet()[ZSet(有序集合)]
     */
    @Test
    public void test() {
        // 给redis保存数据
        //Integer append = stringRedisTemplate.opsForValue().append("msg", "hello");
        //log.info("redis | append : {}", append);
        String msg = stringRedisTemplate.opsForValue().get("msg");
        log.info("msg : {}", msg);
        Long myList = stringRedisTemplate.opsForList().leftPush("myList", "1");
        Long myList1 = stringRedisTemplate.opsForList().leftPush("myList", "2");
        log.info("myList : {} | myList1 : {}", myList, myList1);
        Person person = new Person();
        person.setAge(18);
        person.setName("小明");
        // 默认如果保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
        //redisTemplate.opsForValue().set("emp-01", person);

        // 1.将数据已json的方式保存
        // 2.redisTemplate默认的序列化规则，改变默认的序列化规则。
        empRedisTemplate.opsForValue().set("emp-02", person);
    }

}
