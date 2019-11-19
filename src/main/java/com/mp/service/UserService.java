package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.User;

public interface UserService {
    ServerResponse register(User user);
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> selectQuestion(String username);
    ServerResponse<String> forgetResetPassword(String username, String newPassword, String question, String answer);
    ServerResponse<String> resetPassword(User user, String oldPassword, String newPassword);
}
