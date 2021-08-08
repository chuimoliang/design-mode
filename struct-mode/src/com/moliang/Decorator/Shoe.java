package com.moliang.Decorator;

/**
 * @author zhang qing
 * @date 2021/8/8 14:25
 */
public class Shoe extends Decorate {

    @Override
    public void show() {
        System.out.print(" 鞋子 ");
        super.show();
    }
}
