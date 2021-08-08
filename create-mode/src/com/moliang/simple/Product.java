package com.moliang.simple;

/**
 * @author zhang qing
 * @date 2021/8/3 21:27
 */
public class Product {

    /**
     * 业务代码, 即使用具体实现类的类
     *
     * 无需知道具体的实现类, 使用时具体指定由工厂类的某个子类完成创建
     */
    public void product(SenderFactory factory) {
        factory.create().send();
    }

}
