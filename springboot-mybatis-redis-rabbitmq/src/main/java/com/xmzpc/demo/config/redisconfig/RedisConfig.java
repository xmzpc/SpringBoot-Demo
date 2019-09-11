package com.xmzpc.demo.config.redisconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:17:00.
 */
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix="redis")
public class RedisConfig {

    @Value("${spring.redis.host}")
    private  String host;
    @Value("${spring.redis.port}")
    private  int port;
    @Value("${spring.redis.timeout}")
    private  int timeout;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;
    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.jedis.pool.max-active}")
    private int maxActive;

    public int getMaxActive() {
        return maxActive;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public long getMaxWaitMillis() {
        return maxWaitMillis;
    }

    @Override
    public String toString() {
        return "RedisConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", timeout=" + timeout +
                ", maxIdle=" + maxIdle +
                ", maxWaitMillis=" + maxWaitMillis +
                '}';
    }
}
