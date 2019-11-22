package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.Artcle;

public interface ArtcleService {
    ServerResponse<String> addArtcle(Artcle artcle);
}
