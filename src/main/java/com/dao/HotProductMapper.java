package com.dao;

import com.entity.HotProduct;

public interface HotProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotProduct record);

    int insertSelective(HotProduct record);

    HotProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotProduct record);

    int updateByPrimaryKey(HotProduct record);
}