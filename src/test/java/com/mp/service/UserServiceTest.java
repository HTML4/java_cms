package com.mp.service;

import com.mp.BaseTest;
import com.mp.common.ServerResponse;
import com.mp.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;
    @Test
    public void registerTest(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        user.setQuestion("test");
        user.setAnswer("test");
        ServerResponse response = userService.register(user);
        System.out.println(response.getMsg());
    }
    @Test
    public void loginTest(){
        ServerResponse response = userService.login("test", "test");
        System.out.println(response.getData());
    }
}
