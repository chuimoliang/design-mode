package com.moliang.singleton;

/**
 * @author zhang qing
 * @date 2021/8/4 20:41
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstance() {
        return singleton;
    }

}
