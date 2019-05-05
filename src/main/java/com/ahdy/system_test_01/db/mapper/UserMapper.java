package com.ahdy.system_test_01.db.mapper;

import com.ahdy.system_test_01.db.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}