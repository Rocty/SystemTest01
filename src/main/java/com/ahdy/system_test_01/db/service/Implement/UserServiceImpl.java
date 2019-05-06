package com.ahdy.system_test_01.db.service.Implement;

import com.ahdy.system_test_01.db.mapper.UserMapper;
import com.ahdy.system_test_01.db.model.User;
import com.ahdy.system_test_01.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Rocty
 * @Date: 2019-05-05 16:28
 * @Version: 1.0
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
