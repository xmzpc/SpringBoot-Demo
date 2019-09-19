package com.xmzpc.resource;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Slf4j
@SpringBootApplication
@MapperScan("com.xmzpc.resource.dao")
public class ResourceStartApplication {

    public static  void main(String[] args) {
        SpringApplication.run(ResourceStartApplication.class, args);
        log.info("启动成功");
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
