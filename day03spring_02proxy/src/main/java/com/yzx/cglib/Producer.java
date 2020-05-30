package com.yzx.cglib;

/**
 * @program: day03spring
 * @description: 一个生产者
 * @author: yanzhixian
 * @create: 2020-05-30 17:55
 */
public class Producer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("销售产品，并拿到钱："+money);
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱："+money);
    }
}
