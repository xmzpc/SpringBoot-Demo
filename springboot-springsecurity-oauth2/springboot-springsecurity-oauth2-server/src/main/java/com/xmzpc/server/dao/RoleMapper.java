package com.xmzpc.server.dao;

import com.xmzpc.server.dto.RoleDTO;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleDTO record);

    int insertSelective(RoleDTO record);

    RoleDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleDTO record);

    int updateByPrimaryKey(RoleDTO record);
}