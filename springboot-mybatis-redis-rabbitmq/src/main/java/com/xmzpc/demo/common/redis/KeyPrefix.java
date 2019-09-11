package com.xmzpc.demo.common.redis;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:32:00.
 */
public interface KeyPrefix {

     /**
      * 功能描述: <br>
      * 〈有效期〉
      * @Param: []
      * @Return: int
      * @Author: XuMingZhi
      * @Date: 2019/9/9 15:35
      */
     int expireSeconds();

     /**
      * 功能描述: <br>
      * 〈前缀〉
      * @Param: []
      * @Return: java.lang.String
      * @Author: XuMingZhi
      * @Date: 2019/9/9 15:35
      */
     String getPrefix();
}
