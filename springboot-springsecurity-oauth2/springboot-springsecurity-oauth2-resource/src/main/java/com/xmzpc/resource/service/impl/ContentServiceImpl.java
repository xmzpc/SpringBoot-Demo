package com.xmzpc.resource.service.impl;

import com.xmzpc.resource.dao.ContentMapper;
import com.xmzpc.resource.dto.ContentDTO;
import com.xmzpc.resource.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desciption:
 *
 * @Author: XMZPC.
 * Creation time: 2019/9/17 13:40:00.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<ContentDTO> selectAll() {
        return contentMapper.selectAll();
    }
}
