

**主要技术  **

- SpringBoot+MyBatis+Redis+RabbitMQ

**插件**

- Lombok 打印日志
- better-mybatis-generator自动生成dao层以下的代码
- MapStruct用于实体转换映射



**启动：**

- 修改 application-dev.yml中Mysql 账号密码，sql包中有Demo中用到的简单建库语句（demo_sm.sql）。
- 启动Redis  默认没有密码，如果有密码在RedisConfig以及RedisPoolFactory中自行配置。
- 启动RabbitMQ。

**运行**

- 测试Redis：http://localhost:8080/demo/redis/test   保存的Key为：UserKey:UIDNO666 

- 测试RabbitMQ：http://localhost:8080/demo/mq/direct   Direct 模式

  ​                              http://localhost:8080/demo/mq/topic    Topic 模式

