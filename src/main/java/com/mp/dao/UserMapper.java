package com.mp.dao;

import com.mp.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User selectLogin(@Param(value = "username") String username, @Param(value = "password") String password);

    String selectQuestionByUsername(String username);

    int selectIdByUsernameQustionAnswer(@Param(value = "username") String username, @Param(value = "question") String question, @Param(value = "answer") String answer);
}