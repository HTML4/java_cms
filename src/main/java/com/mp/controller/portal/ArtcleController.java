package com.mp.controller.portal;

import com.mp.common.ServerResponse;
import com.mp.entity.Artcle;
import com.mp.service.ArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("artcle")
public class ArtcleController {
    @Autowired
    private ArtcleService artcleService;

    @RequestMapping("getList.do")
    @ResponseBody
    public ServerResponse<List<Artcle>> getArtcleList(){
        return artcleService.selectArtcleList();
    }
}
