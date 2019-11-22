package com.mp.service.impl;

import com.mp.common.ServerResponse;
import com.mp.dao.ArtcleMapper;
import com.mp.entity.Artcle;
import com.mp.service.ArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
        int resultCount = artcleMapper.insertSelective(artcle);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }
}
