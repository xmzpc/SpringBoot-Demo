package com.xmzpc.demo.service;



import com.xmzpc.demo.common.redis.KeyPrefix;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:30:00.
 */

public interface RedisService {

    /**
     * 获取当个对象
     * */
     <T> T get(KeyPrefix prefix, String key, Class<T> clazz);

    /**
     * 获取当个对象集合
     * */
     <T> List<T> getList(KeyPrefix prefix, String key, Class<T> clazz);
    /**
     * 设置对象
     * */
     <T> boolean set(KeyPrefix prefix, String key, T value) ;


    /**
     * 判断key是否存在
     * */
     <T> boolean exists(KeyPrefix prefix, String key);

    /**
     * 删除
     * */
     boolean delete(KeyPrefix prefix, String key);

    /**
     * 增加值
     * */
     <T> Long incr(KeyPrefix prefix, String key);

    /**
     * 减少值
     * */
     <T> Long decr(KeyPrefix prefix, String key) ;

     boolean delete(KeyPrefix prefix);

     List<String> scanKeys(String key) ;

}
