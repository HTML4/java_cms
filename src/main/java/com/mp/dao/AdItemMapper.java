package com.mp.dao;

import com.mp.entity.AdItem;

public interface AdItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdItem record);

    int insertSelective(AdItem record);

    AdItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdItem record);

    int updateByPrimaryKey(AdItem record);
}