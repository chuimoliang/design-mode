package com.moliang.abstraction;

/**
 * @author zhang qing
 * @date 2021/8/3 21:58
 */
public abstract class AbstractFactory implements Factory {

    public abstract First productFirst();

    public Second productSecond() {
        return new ASecond();
    }

}
