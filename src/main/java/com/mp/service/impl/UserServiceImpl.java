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
    public ServerResponse<String> register(User user) {
        ServerResponse validResponse = this.checkValid(user.getUsername());
        if(StringUtils.isBlank(user.getQuestion()) || StringUtils.isBlank(user.getAnswer())) {
            return ServerResponse.createByErrorMessage("问题和答案不能为空");
        }
        if(!validResponse.isSuccess()) {
            return validResponse;
        }
        //md5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        user.setRole(Const.Role.ROLE_CUSTOMER);
        user.setCreateTime(new Date());
        int resultCount = userMapper.insert(user);
        if(resultCount > 0) {
            return ServerResponse.createBySuccessMessage("注册成功");
        } else {
            return ServerResponse.createByErrorMessage("注册失败");
        }
    }

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户不存在");
        }
        String passwordMd5 = MD5Util.MD5EncodeUtf8(password);
        User user = userMapper.selectLogin(username, passwordMd5);
        if(user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }
        return ServerResponse.createBySuccess("登录成功", user);
    }

    /**
     * 获取重置密码的问题
     * @param username
     * @return
     */
    @Override
    public ServerResponse<String> selectQuestion(String username) {
        ServerResponse validResponse = this.checkValid(username);
        if(!validResponse.isSuccess()) {
            return validResponse;
        }
        String question = userMapper.selectQuestionByUsername(username);
        if(StringUtils.isBlank(question)) {
            return ServerResponse.createByErrorMessage("找回密码的问题是空的");
        }
        return ServerResponse.createBySuccess(question);
    }

    /**
     * 用于问题找回密码
     * @param username
     * @param question
     * @param answer
     * @return
     */
    @Override
    public ServerResponse<String> forgetResetPassword(String username, String newPassword, String question, String answer) {
        ServerResponse validResponse = this.checkValid(username);
        if(!validResponse.isSuccess()) {
            return validResponse;
        }
        int userId = userMapper.selectIdByUsernameQustionAnswer(username, question, answer);
        if(userId == 0) {
            return ServerResponse.createByErrorMessage("问题答案错误");
        }
        String newPasswordMd5 = MD5Util.MD5EncodeUtf8(newPassword);
        User user = new User();
        user.setId(userId);
        user.setPassword(newPasswordMd5);
        user.setUpdateTime(new Date());
        int updateCount = userMapper.updateByPrimaryKeySelective(user);
        if(updateCount == 0) {
            return ServerResponse.createByErrorMessage("修改密码失败");
        }
        return ServerResponse.createBySuccess("修改成功");
    }

    /**
     * 用于重置密码
     * @param user
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @Override
    public ServerResponse<String> resetPassword(User user, String oldPassword, String newPassword) {
        ServerResponse response = this.login(user.getUsername(), oldPassword);
        if(!response.isSuccess()) {
            return response;
        }
        String newPasswordMd5 = MD5Util.MD5EncodeUtf8(newPassword);
        user.setPassword(newPasswordMd5);
        user.setUpdateTime(new Date());
        int updateCount = userMapper.updateByPrimaryKeySelective(user);
        if(updateCount == 0) {
            return ServerResponse.createByErrorMessage("修改密码失败");
        }
        return ServerResponse.createBySuccess("修改成功");
    }

    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
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
