package com.mp.controller.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mp.common.ServerResponse;
import com.mp.dao.ArtcleMapper;
import com.mp.entity.Artcle;
import com.mp.entity.Category;
import com.mp.service.ArtcleService;
import com.mp.service.CategoryService;
import com.mp.vo.CategoryTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArtcleMapper artcleMapper;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        ServerResponse categoryList = categoryService.selectCategoryList();
        List<Artcle> productList = artcleMapper.selectArtcleListByPage(3, 0, 7);
        List<Artcle> aboutList = artcleMapper.selectArtcleListByPage(4, 0, 1);
        List<Artcle> newsList = artcleMapper.selectArtcleListByPage(2, 0, 3);
        request.setAttribute("categoryList", categoryList.getData());
        request.setAttribute("productList", productList);
//        request.setAttribute("about", aboutList.get(0));
        request.setAttribute("newsList", newsList);
        return "index";
    }
}
