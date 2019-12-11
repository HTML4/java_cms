package com.mp.controller.portal;

import com.mp.common.ServerResponse;
import com.mp.controller.common.BaseController;
import com.mp.entity.Artcle;
import com.mp.service.ArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("artcle")
public class ArtcleController extends BaseController {
    @Autowired
    private ArtcleService artcleService;

    @RequestMapping("getList.do")
    @ResponseBody
    public ServerResponse<List<Artcle>> getArtcleList(){
        System.out.println(adminPath);
        return artcleService.selectArtcleList();
    }

    @RequestMapping("${adminPath}/addOrUpdate.do")
    @ResponseBody
    public ServerResponse<String> addOrUpdate(Artcle artcle){
        if(artcle.getId() == null) {
            return artcleService.addArtcle(artcle);
        }
        return artcleService.updateArtcle(artcle);
    }
}
