package com.xmzpc.demo.service.impl;

import com.xmzpc.demo.dao.PermissionMapper;
import com.xmzpc.demo.dto.PermissionDTO;
import com.xmzpc.demo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:16:00.
 */
@Service
public class PermissionServiceImpl implements PermissionService {


    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<PermissionDTO> selectByUserId(Long userId) {
        return permissionMapper.selectByUserId(userId);
    }
}
