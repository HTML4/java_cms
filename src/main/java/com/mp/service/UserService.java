package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.User;

public interface UserService {
    ServerResponse register(User user);
}
