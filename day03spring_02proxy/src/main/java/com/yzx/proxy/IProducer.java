package com.yzx.proxy;

/**
 * @program: day03spring
 * @description: 对生产厂家要求的接口
 * @author: yanzhixian
 * @create: 2020-05-30 17:47
 */
public interface IProducer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
