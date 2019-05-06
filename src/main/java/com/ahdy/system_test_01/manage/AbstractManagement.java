package com.ahdy.system_test_01.manage;

/**
 * @Description: 抽象类，管理包
 * @Author: Rocty
 * @Date: 2019-05-06 13:59
 * @Version: 1.0
 */
public abstract class AbstractManagement {

    public AbstractManagement(){
        this.id = 1001;
        this.type = "Manage";
    }

    private int id;
    private String type;

}
