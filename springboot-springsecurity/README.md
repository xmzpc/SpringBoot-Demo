**主要技术  **

- SpringBoot+MyBatis+HikariCP+SpringSecurity

**插件**

- Lombok 打印日志
- better-mybatis-generator自动生成dao层以下的代码
- MapStruct用于实体转换映射
- 实现oAuth2 协议

**启动：**

- 修改 application-dev.yml中Mysql 账号密码，sql包中有Demo中用到的简单建库语句（demo_sm.sql）
- 事先运行test包下的PasswordEncoderTest，并存入oauth_client_details表下的client_secret中。new BCryptPasswordEncoder().encode("secret")
-                                      存入tb_user表下的password中。new BCryptPasswordEncoder().encode("123456")

**运行**

- 测试登录：http://localhost:8080/demo/oauth/authorize?client_id=client&response_type=code  
- 账号：admin
- 密码：123456
