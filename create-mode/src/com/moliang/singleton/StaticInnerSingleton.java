package com.moliang.singleton;

/**
 * @author zhang qing
 * @date 2021/8/4 20:34
 */
public class StaticInnerSingleton {

    private static class SingletonInstance {
        static StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonInstance.singleton;
    }

}
