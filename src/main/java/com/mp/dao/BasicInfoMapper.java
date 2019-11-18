package com.mp.dao;

import com.mp.entity.BasicInfo;

public interface BasicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BasicInfo record);

    int insertSelective(BasicInfo record);

    BasicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BasicInfo record);

    int updateByPrimaryKey(BasicInfo record);
}