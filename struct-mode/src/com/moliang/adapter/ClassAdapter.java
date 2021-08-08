package com.moliang.adapter;

/**
 * @author zhang qing
 * @date 2021/8/5 20:45
 */
public class ClassAdapter extends Source implements Target {

    @Override
    public int output5V() {
        int res = super.output220V();
        return res / 44;
    }
}
