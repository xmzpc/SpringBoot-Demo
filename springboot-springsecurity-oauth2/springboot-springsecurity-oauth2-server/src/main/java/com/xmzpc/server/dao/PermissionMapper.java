package com.xmzpc.server.dao;

import com.xmzpc.server.dto.PermissionDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionDTO record);

    int insertSelective(PermissionDTO record);

    PermissionDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionDTO record);

    int updateByPrimaryKey(PermissionDTO record);

    List<PermissionDTO> selectByUserId(@Param("userId") Long userId);
}