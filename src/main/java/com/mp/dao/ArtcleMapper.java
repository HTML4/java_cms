package com.mp.dao;

import com.mp.entity.Artcle;

public interface ArtcleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Artcle record);

    int insertSelective(Artcle record);

    Artcle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Artcle record);

    int updateByPrimaryKey(Artcle record);
}