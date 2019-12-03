package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.Artcle;

import java.util.List;

public interface ArtcleService {
    ServerResponse<String> addArtcle(Artcle artcle);

    ServerResponse<String> deleteArtcle(Integer id);

    ServerResponse<String> updateArtcle(Artcle artcle);

    ServerResponse<List<Artcle>> selectArtcleList();

    ServerResponse<Artcle> selectArtcle(Integer id);
}
