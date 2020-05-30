package com.yzx.service;

/**
 * @program: day03spring
 * @description: 账户的业务层接口
 * @author: yanzhixian
 * @create: 2020-05-30 22:37
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     * @param i
     */
    void updateAccount(int i);

    /**
     * 删除账户
     * @return
     */
    int  deleteAccount();
}
