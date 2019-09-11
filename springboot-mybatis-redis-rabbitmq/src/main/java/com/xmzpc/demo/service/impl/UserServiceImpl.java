package com.xmzpc.demo.service.impl;

import com.xmzpc.demo.dao.UserMapper;
import com.xmzpc.demo.dto.UserDTO;
import com.xmzpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 11:07:00.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> selectAll() {
        return userMapper.selectAll();
    }
}
