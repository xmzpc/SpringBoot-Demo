package com.xmzpc.auth.server;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/17 10:56:00.
 */
public class Test {

    public static void main(String[] args) {

        String a="hello world";
        String b= "hello";
        System.out.println(a.intern()==(b+" world").intern());
    //    System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
