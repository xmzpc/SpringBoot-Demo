package com.xmzpc.demo.service.impl;

import com.xmzpc.demo.dao.UserMapper;
import com.xmzpc.demo.dto.UserDTO;
import com.xmzpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:02:00.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserMapper userMapper;
    @Override
    public UserDTO getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
