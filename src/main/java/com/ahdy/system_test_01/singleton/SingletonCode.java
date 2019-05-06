package com.ahdy.system_test_01.singleton;

import com.ahdy.system_test_01.manage.UserSystemManage;

/**
 * @Description:
 * @Author: Rocty
 * @Date: 2019-05-06 14:16
 * @Version: 1.0
 */
public interface SingletonCode {
    public final static UserSystemManage USER_MANAGER = UserSystemManage.getInstance();
}
