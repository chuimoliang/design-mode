package com.moliang.adapter;

/**
 * @author zhang qing
 * @date 2021/8/5 20:47
 */
public class BeanAdapter implements Target {

    private Source source;

    @Override
    public int output5V() {
        return source.output220V() / 44;
    }
}
