package com.xmzpc.demo.service;

import com.xmzpc.demo.dto.UserDTO;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:02:00.
 */
public interface UserService {

    UserDTO getByUsername(String username);
}
