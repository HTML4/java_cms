package com.mp.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mp.common.ServerResponse;
import com.mp.entity.Artcle;
import com.mp.service.ArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("artcle")
public class ArtcleController {
    @Autowired
    private ArtcleService artcleService;

    @RequestMapping("getArtcleList.do")
    @ResponseBody
    public ServerResponse<PageInfo> getArtcleList(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                                  @RequestParam(value = "categoryId", required = false) Integer categoryId){
        return artcleService.selectArtcleList(pageNum, pageSize, categoryId);
    }

    @RequestMapping("getArtcleDetail.do")
    @ResponseBody
    public ServerResponse<Artcle> getArtcleDetail(@RequestParam(value = "id", required = false) Integer id,
                                                  @RequestParam(value = "categoryId", required = false) Integer categoryId){
        return artcleService.selectArtcle(id, categoryId);
    }

    @RequestMapping("a/addOrUpdateArtcle.do")
    @ResponseBody
    public ServerResponse<String> addOrUpdate(Artcle artcle){
        if(artcle.getId() == null) {
            return artcleService.addArtcle(artcle);
        }
        return artcleService.updateArtcle(artcle);
    }

    @RequestMapping("a/deleteArtcle.do")
    @ResponseBody
    public ServerResponse<String> delete(Integer id){
        return artcleService.deleteArtcle(id);
    }
}
