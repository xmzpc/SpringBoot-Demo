package com.xmzpc.resource.dao;

import com.xmzpc.resource.dto.ContentDTO;

import java.util.List;

public interface ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContentDTO record);

    int insertSelective(ContentDTO record);

    ContentDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContentDTO record);

    int updateByPrimaryKeyWithBLOBs(ContentDTO record);

    int updateByPrimaryKey(ContentDTO record);

    List<ContentDTO> selectAll();
}