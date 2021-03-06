package com.xmzpc.server.dao;

import com.xmzpc.server.dto.UserDTO;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);

    UserDTO getByUsername(String username);
}