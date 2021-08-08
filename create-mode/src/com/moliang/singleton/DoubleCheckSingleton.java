package com.moliang.singleton;

/**
 * @author zhang qing
 * @date 2021/8/4 20:25
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    private static DoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
