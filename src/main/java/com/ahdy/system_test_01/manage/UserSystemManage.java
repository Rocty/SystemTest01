package com.ahdy.system_test_01.manage;

/**
 * @Description: 用户数据管理类，包含登录验证等方法
 * @Author: Rocty
 * @Date: 2019-05-06 13:39
 * @Version: 1.0
 */
public class UserSystemManage extends AbstractManagement {

    private static volatile UserSystemManage instance;
    private UserSystemManage() {
        super();
    }
    public static UserSystemManage getInstance() {
        if (instance == null) {
            synchronized (UserSystemManage.class) {
                if (instance == null) {
                    instance = new UserSystemManage();
                }
            }
        }
        return instance;
    }




    public String output(){
        return "test";
    }



}
