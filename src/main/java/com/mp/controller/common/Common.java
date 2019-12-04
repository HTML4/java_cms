package com.mp.controller.common;

import com.google.common.collect.Maps;
import com.mp.common.ServerResponse;
import com.mp.service.IFileService;
import com.mp.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/common")
public class Common {
    @Autowired
    private IFileService iFileService;
    @ResponseBody
    @RequestMapping("upload.do")
    public ServerResponse upload(HttpSession session, @RequestParam(value = "upload_file", required = false) MultipartFile file, HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("upload");
        String targetName = iFileService.upload(file, path);
        String url = PropertiesUtil.getProperty("ftp.server.http.prefix") + targetName;
        Map fileMap = Maps.newHashMap();
        fileMap.put("name", targetName);
        fileMap.put("url", url);
        return ServerResponse.createBySuccess(fileMap);
    }
}
