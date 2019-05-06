package com.ahdy.system_test_01.db.mapper;

import com.ahdy.system_test_01.db.model.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUser();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}