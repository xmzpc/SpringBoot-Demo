package com.xmzpc.demo.vo;

import java.io.Serializable;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 14:14:00.
 */
public class UserVO implements Serializable{

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
