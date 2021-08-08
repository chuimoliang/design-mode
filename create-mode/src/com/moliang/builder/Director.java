package com.moliang.builder;

/**
 * @author zhang qing
 * @date 2021/8/5 19:53
 */
public class Director {

    public void build(Builder builder) {
        builder.builderFirst();
        builder.builderSecond();
    }

}
