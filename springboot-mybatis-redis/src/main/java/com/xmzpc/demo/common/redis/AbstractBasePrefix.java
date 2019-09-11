package com.xmzpc.demo.common.redis;

import java.io.Serializable;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/9 15:37:00.
 */
public class AbstractBasePrefix implements KeyPrefix,Serializable {

    private int expireSeconds;

    private String prefix;

    public AbstractBasePrefix(String prefix) {
        // 0代表永不过期
        this(0, prefix);
    }

    public AbstractBasePrefix( int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    @Override
    public int expireSeconds() {
        // 默认0代表永不过期
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":" + prefix;
    }
}
