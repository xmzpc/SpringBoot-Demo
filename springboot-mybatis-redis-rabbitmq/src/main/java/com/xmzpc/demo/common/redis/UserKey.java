package com.xmzpc.demo.common.redis;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:44:00.
 */
public class UserKey extends AbstractBasePrefix {

    public UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getUserByUid = new UserKey("UID");
}
