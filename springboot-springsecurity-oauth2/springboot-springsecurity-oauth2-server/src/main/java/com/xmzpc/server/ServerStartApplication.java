package com.xmzpc.server;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.xmzpc.server.dao")
public class ServerStartApplication {

    public static  void main(String[] args) {
        SpringApplication.run(ServerStartApplication.class, args);
        log.info("启动成功");
    }

}
