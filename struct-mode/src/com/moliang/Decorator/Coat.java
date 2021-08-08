package com.moliang.Decorator;

/**
 * @author zhang qing
 * @date 2021/8/8 14:25
 */
public class Coat extends Decorate {

    @Override
    public void show() {
        System.out.print(" 大衣 ");
        super.show();
    }
}
