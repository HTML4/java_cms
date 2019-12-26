package com.mp.controller.common;

import com.google.common.collect.Lists;
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
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/common")
public class Common {
    @Autowired
    private IFileService iFileService;
    @ResponseBody
    @RequestMapping("upload.do")
    public ServerResponse upload(HttpServletRequest request,
                                 @RequestParam(value = "upload_file", required = false) MultipartFile file,
                                 @RequestParam(value = "remotePath", required = false, defaultValue = "file") String remotePath) {
        String path = request.getSession().getServletContext().getRealPath("upload");
        String targetName = iFileService.upload(file, path, remotePath);
        String uri = "/" + remotePath + "/" + targetName;
//        String url = PropertiesUtil.getProperty("ftp.server.http.prefix") + uri;
        Map fileMap = Maps.newHashMap();
        fileMap.put("name", targetName);
        fileMap.put("url", uri);
        return ServerResponse.createBySuccess(fileMap);
    }
    @ResponseBody
    @RequestMapping("upload_edit.do")
    public Map uploadEdit(HttpServletRequest request,
                          @RequestParam(value = "upload_file", required = false) MultipartFile file,
                          @RequestParam(value = "remotePath", required = false, defaultValue = "file") String remotePath) {
        String path = request.getSession().getServletContext().getRealPath("upload");
        String targetName = iFileService.upload(file, path, remotePath);
        String uri = "/"+ remotePath + "/" + targetName;
//        String url = PropertiesUtil.getProperty("ftp.server.http.prefix") + uri;
        Map fileMap = Maps.newHashMap();
        List<String> data = Lists.newArrayList();
        if(targetName == null) {
            fileMap.put("errno", 1);
        } else {
            fileMap.put("errno", 0);
            data.add(uri);
            fileMap.put("data", data);
        }
        return fileMap;
    }
}
