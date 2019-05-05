package com.ahdy.system_test_01.db.mapper;

import com.ahdy.system_test_01.db.model.Role_Permission;

public interface Role_PermissionMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role_Permission record);

    int insertSelective(Role_Permission record);

    Role_Permission selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role_Permission record);

    int updateByPrimaryKey(Role_Permission record);
}