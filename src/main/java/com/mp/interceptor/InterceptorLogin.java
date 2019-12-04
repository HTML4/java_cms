package com.mp.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mp.common.Const;
import com.mp.common.ServerResponse;
import com.mp.entity.User;

import com.mp.util.JsonUtil;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.io.PrintWriter;

public class InterceptorLogin extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // TODO Auto-generated method stub
        //判断用户是否登陆  如果没有登陆    不放行   如果登陆了  就放行了
        User user = (User) request.getSession().getAttribute(Const.CURRENT_USER);
        if(user == null) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            PrintWriter pw = response.getWriter();
            pw.write(JsonUtil.obj2String(ServerResponse.createByErrorMessage("用户未登录")));
            pw.flush();
            pw.close();
            return false;
        }
        return true;
    }

}

