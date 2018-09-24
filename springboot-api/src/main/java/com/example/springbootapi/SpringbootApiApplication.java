package com.example.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author
 */
@SpringBootApplication
@EnableSwagger2
public class SpringbootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiApplication.class, args);
    }
}
