package com.xmzpc.auth.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 10:44:00.
 */
public class PasswordEncoderTest {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
