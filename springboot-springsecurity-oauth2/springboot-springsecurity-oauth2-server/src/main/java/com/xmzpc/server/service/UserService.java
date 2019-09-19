package com.xmzpc.server.service;

import com.xmzpc.server.dto.UserDTO;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:02:00.
 */
public interface UserService {

    UserDTO getByUsername(String username);
}
