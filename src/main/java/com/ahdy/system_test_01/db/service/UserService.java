package com.ahdy.system_test_01.db.service;

import com.ahdy.system_test_01.db.model.User;

import java.util.List;

/**
 * @Description:
 * @Author: Rocty
 * @Date: 2019-05-05 16:27
 * @Version: 1.0
 */
public interface UserService {
    int addUser(User user);

//    List<User> findAllUser(int pageNum, int pageSize);
    List<User> selectAllUser();


}
