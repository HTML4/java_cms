package com.mp.service;

import com.github.pagehelper.PageInfo;
import com.mp.common.ServerResponse;
import com.mp.entity.Artcle;


public interface ArtcleService {
    ServerResponse<String> addArtcle(Artcle artcle);

    ServerResponse<String> deleteArtcle(Integer id);

    ServerResponse<String> updateArtcle(Artcle artcle);

    ServerResponse<PageInfo> selectArtcleList(int pageNum, int pageSize, Integer categoryId);

    ServerResponse<Artcle> selectArtcle(Integer id);
}
