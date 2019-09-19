package com.xmzpc.resource.service;

import com.xmzpc.resource.dto.ContentDTO;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/17 13:40:00.
 */
public interface ContentService {

    List<ContentDTO> selectAll();
}
