package com.moliang.abstraction;

/**
 * @author zhang qing
 * @date 2021/8/3 22:04
 */
public class BFactory extends AbstractFactory {

    @Override
    public First productFirst() {
        return new BFirst();
    }
}
