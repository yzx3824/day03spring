package com.yzx.service.impl;

import com.yzx.service.IAccountService;

/**
 * @program: day03spring
 * @description: 账户的业务层实现类
 * @author: yanzhixian
 * @create: 2020-05-30 22:38
 */
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
