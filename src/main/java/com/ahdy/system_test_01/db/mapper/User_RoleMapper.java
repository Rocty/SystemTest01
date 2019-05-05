package com.ahdy.system_test_01.db.mapper;

import com.ahdy.system_test_01.db.model.User_Role;

public interface User_RoleMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User_Role record);

    int insertSelective(User_Role record);

    User_Role selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User_Role record);

    int updateByPrimaryKey(User_Role record);
}