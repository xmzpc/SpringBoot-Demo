package com.xmzpc.demo.dao;

import com.xmzpc.demo.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);

    List<UserDTO> selectAll();
}