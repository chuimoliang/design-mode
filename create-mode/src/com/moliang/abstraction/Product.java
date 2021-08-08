package com.moliang.abstraction;

/**
 * @author zhang qing
 * @date 2021/8/4 11:39
 */
public class Product {

    public void produce(Factory factory) {
        // 业务代码
        factory.productFirst().first();
        // ...
        factory.productSecond().second();
        // ...
    }

}
