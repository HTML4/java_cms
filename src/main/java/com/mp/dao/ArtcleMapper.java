package com.mp.dao;

import com.mp.entity.Artcle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArtcleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Artcle record);

    int insertSelective(Artcle record);

    Artcle selectByPrimaryKey(@Param(value = "id") Integer id, @Param(value = "categoryId") Integer categoryId);

    int updateByPrimaryKeySelective(Artcle record);

    int updateByPrimaryKey(Artcle record);

    List<Artcle> selectArtcleList(@Param(value = "categoryId") Integer categoryId);

    List<Artcle> selectArtcleListByPage(@Param(value = "pageNum") int pageNum, @Param(value = "pageSize") int pageSize, @Param(value = "categoryId") Integer categoryId);
}