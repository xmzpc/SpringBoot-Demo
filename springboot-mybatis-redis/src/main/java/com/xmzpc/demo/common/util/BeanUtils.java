package com.xmzpc.demo.common.util;

import com.alibaba.fastjson.JSON;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/11 14:23:00.
 */
public class BeanUtils {


    /**
     * 功能描述: <br>
     * 〈实体类转String〉
     * @Param: [value]
     * @Return: java.lang.String
     * @Author: XuMingZhi
     * @Date: 2019/9/11 14:24
     */
    public static <T> String beanToString(T value) {
        if(value == null) {
            return null;
        }
        Class<?> clazz = value.getClass();
        if(clazz == int.class || clazz == Integer.class) {
            return ""+value;
        }else if(clazz == String.class) {
            return (String)value;
        }else if(clazz == long.class || clazz == Long.class) {
            return ""+value;
        }else {
            return JSON.toJSONString(value);
        }
    }

    /**
     * 功能描述: <br>
     * 〈String转实体类〉
     * @Param: [str, clazz]
     * @Return: T
     * @Author: XuMingZhi
     * @Date: 2019/9/11 14:24
     */
    @SuppressWarnings("unchecked")
    public static <T> T stringToBean(String str, Class<T> clazz) {
        if(str == null || str.length() <= 0 || clazz == null) {
            return null;
        }
        if(clazz == int.class || clazz == Integer.class) {
            return (T)Integer.valueOf(str);
        }else if(clazz == String.class) {
            return (T)str;
        }else if(clazz == long.class || clazz == Long.class) {
            return  (T)Long.valueOf(str);
        }else {
            return JSON.toJavaObject(JSON.parseObject(str), clazz);

        }
    }
}
