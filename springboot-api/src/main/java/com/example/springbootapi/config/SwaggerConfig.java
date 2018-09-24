package com.example.springbootapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: 海仔
 * @Date: 2018/9/24 0024 20:51
 * @Version 1.0
 */
@Slf4j
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootapi.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("api文档")
                // 创建人
                .contact(new Contact("海仔", "www.baidu.com", ""))
                // 服务条款网址
                // .termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                // 描述
                .description("API 描述")
                //.contact(new Contact("帅呆了", "url", "email"))
                .build();
    }

}
