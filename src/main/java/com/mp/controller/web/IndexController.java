package com.mp.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        request.setAttribute("admin", "admin");
        System.out.println("===");
        return "index";
    }
}
