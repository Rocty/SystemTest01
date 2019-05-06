package com.ahdy.system_test_01.manage;

import com.ahdy.system_test_01.singleton.SingletonCode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Rocty
 * @Date: 2019-05-06 14:41
 * @Version: 1.0
 */
public class UserSystemManageTest implements SingletonCode {

    @Test
    public void output() {
    }

    public static void main(String[] args) {
        System.out.println(USER_MANAGER.output());
    }
}