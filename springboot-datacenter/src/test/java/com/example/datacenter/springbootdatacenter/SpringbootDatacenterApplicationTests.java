package com.example.datacenter.springbootdatacenter;

import com.example.springbootutils.utils.snowflake.SnowflakeIdFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootDatacenterApplicationTests {

   /* @Autowired
    private SnowflakeIdFactory snowflakeIdFactory;*/

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSnowflake() {
        SnowflakeIdFactory snowflakeIdFactory = new SnowflakeIdFactory(1,2);
        for (int i = 0; i < 100000; i++) {
            long l = snowflakeIdFactory.nextId();
            log.info("testSnowflake : {}", l);
        }
        Assert.assertNotNull(snowflakeIdFactory);
    }

}
