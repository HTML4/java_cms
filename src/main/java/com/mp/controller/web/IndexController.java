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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArtcleService artcleService;

    @RequestMapping("/")
    public String index(HttpServletRequest request, Model model) {
        ServerResponse categoryList = categoryService.selectCategoryList();
        List<Artcle> productList = artcleService.selectArtcleListByPage(1, 8, 3);
        List<Artcle> aboutList = artcleService.selectArtcleListByPage(1, 1, 4);
        List<Artcle> newsList = artcleService.selectArtcleListByPage(1, 4, 2);
        model.addAttribute("categoryList", categoryList.getData());
        model.addAttribute("productList", productList);
//        request.setAttribute("about", aboutList.get(0));
        model.addAttribute("newsList", newsList);
        return "index";
    }
    @RequestMapping("/article")
    public String article(HttpServletRequest request, Model model) {
        ServerResponse categoryList = categoryService.selectCategoryList();
        Integer id = Integer.parseInt(request.getParameter("id"));
        ServerResponse articleSe = artcleService.selectArtcle(id, null);
        model.addAttribute("categoryList", categoryList.getData());
        model.addAttribute("article", articleSe.getData());
        return "article";
    }
}
