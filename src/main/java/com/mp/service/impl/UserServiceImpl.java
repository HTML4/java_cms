package com.mp.service.impl;

import com.mp.common.Const;
import com.mp.common.ServerResponse;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import com.mp.service.UserService;
import com.mp.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public ServerResponse register(User user) {
        ServerResponse validResponse = this.checkValid(user.getUsername());
        if(StringUtils.isBlank(user.getQuestion()) || StringUtils.isBlank(user.getAnswer())) {
            return ServerResponse.createByErrorMessage("问题和答案不能为空");
        } else if(validResponse.isSuccess()) {
            //md5加密
            user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
            user.setRole(Const.Role.ROLE_CUSTOMER);
            user.setCreateTime(new Date());
            int resultCount = userMapper.insert(user);
            if(resultCount > 0) {
                return ServerResponse.createBySuccess();
            } else {
                return ServerResponse.createByErrorMessage("注册失败");
            }
        } else {
            return validResponse;
        }
    }

    public ServerResponse<String> checkValid(String username) {
        if(StringUtils.isNotBlank(username)) {
            int resultCount = userMapper.checkUsername(username);
            if(resultCount > 0) {
                return ServerResponse.createByErrorMessage("用户名已存在");
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccess("校验成功");
    }
}
