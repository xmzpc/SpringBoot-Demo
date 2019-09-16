package com.xmzpc.demo.service;

import com.xmzpc.demo.dto.PermissionDTO;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/16 14:15:00.
 */
public interface PermissionService {

    List<PermissionDTO> selectByUserId(Long userId);
}
