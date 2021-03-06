package com.mp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mp.common.ServerResponse;
import com.mp.dao.ArtcleMapper;
import com.mp.entity.Artcle;
import com.mp.service.ArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArtcleServiceImpl implements ArtcleService {
    @Autowired
    private ArtcleMapper artcleMapper;

    public ServerResponse<String> addArtcle(Artcle artcle) {
        if(artcle.getCategoryId() == null) {
            return ServerResponse.createByErrorMessage("分类ID不能为空");
        }
        if(artcle.getTitle() == null) {
            return ServerResponse.createByErrorMessage("标题不能为空");
        }
        if(artcle.getContent() == null) {
            return ServerResponse.createByErrorMessage("内容不能为空");
        }
        artcle.setCreateTime(new Date());
        artcle.setUpdateTime(new Date());
        int resultCount = artcleMapper.insertSelective(artcle);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    @Override
    public ServerResponse<String> deleteArtcle(Integer id) {
        if(id == null) {
            return ServerResponse.createByErrorMessage("id不能为空");
        }
        int resultCount = artcleMapper.deleteByPrimaryKey(id);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    @Override
    public ServerResponse<String> updateArtcle(Artcle artcle) {
        if (artcle == null || artcle.getId() == null) {
            return ServerResponse.createByErrorMessage("id不能为空");
        }
        artcle.setUpdateTime(new Date());
        int resultCount = artcleMapper.updateByPrimaryKeySelective(artcle);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("修改失败");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    @Override
    public ServerResponse<PageInfo> selectArtcleList(int pageNum, int pageSize, Integer categoryId) {
        PageHelper.startPage(pageNum, pageSize);
        List<Artcle> artcleList = artcleMapper.selectArtcleList(categoryId);
        PageInfo pageResult = new PageInfo(artcleList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse<Artcle> selectArtcle(Integer id, Integer categoryId) {
        if(id == null && categoryId == null) {
            return ServerResponse.createByErrorMessage("文章id和栏目id不能同同时为空");
        }
        Artcle artcle = artcleMapper.selectByPrimaryKey(id, categoryId);
        if(artcle == null) {
            return ServerResponse.createByErrorMessage("文章不存在");
        }
        return ServerResponse.createBySuccess(artcle);
    }

    @Override
    public List<Artcle> selectArtcleListByPage(int pageNum, int pageSize, Integer categoryId) {
        int num = (pageNum - 1) * 10;
        int size = pageSize * pageNum;
        return artcleMapper.selectArtcleListByPage(num, size, categoryId);
    }
}
