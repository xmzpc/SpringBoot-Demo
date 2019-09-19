package com.xmzpc.resource.dao;

import com.xmzpc.resource.dto.ContentCategoryDTO;

public interface ContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContentCategoryDTO record);

    int insertSelective(ContentCategoryDTO record);

    ContentCategoryDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContentCategoryDTO record);

    int updateByPrimaryKey(ContentCategoryDTO record);
}