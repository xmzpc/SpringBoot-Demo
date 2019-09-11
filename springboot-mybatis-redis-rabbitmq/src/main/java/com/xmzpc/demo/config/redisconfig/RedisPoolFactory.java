package com.xmzpc.demo.config.redisconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:26:00.
 */

@Service
public class RedisPoolFactory {

    @Autowired
    RedisConfig redisConfig;

    @Bean
    public JedisPool JedisPoolFactory() {

        System.out.println(redisConfig.toString());
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(redisConfig.getMaxIdle());
        poolConfig.setMaxTotal(redisConfig.getMaxActive());
        poolConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis() * 1000);
//        JedisPool jedisPool = new JedisPool(poolConfig, redisConfig.getHost(), redisConfig.getPort(),
//                redisConfig.getTimeout()*1000, redisConfig.getPassword(), 0);
        JedisPool jedisPool = new JedisPool(poolConfig, redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout());
        return jedisPool;
    }
}
