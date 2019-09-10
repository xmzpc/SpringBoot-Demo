package com.xmzpc.demo.service;

import com.xmzpc.demo.dto.UserDTO;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/10 11:04:00.
 */
public interface UserService {

    List<UserDTO> selectAll();

}
