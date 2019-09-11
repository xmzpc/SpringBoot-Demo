package com.xmzpc.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.xmzpc.demo.dao")
public class TrainStartApplication {

    public static  void main(String[] args) {
        SpringApplication.run(TrainStartApplication.class, args);
        log.info("启动成功");
    }

}
