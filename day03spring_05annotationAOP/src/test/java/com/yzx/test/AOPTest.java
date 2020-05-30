package com.yzx.test;

import com.yzx.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: day03spring
 * @description: 测试AOP的配置
 * @author: yanzhixian
 * @create: 2020-05-30 22:40
 */
public class AOPTest {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        //3.执行方法
        as.saveAccount();
//        as.updateAccount(1);
//        as.deleteAccount();
    }
}
