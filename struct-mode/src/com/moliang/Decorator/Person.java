package com.moliang.Decorator;

/**
 * @author zhang qing
 * @date 2021/8/8 14:21
 */
public class Person {

    String name;

    public void show() {
        System.out.println();
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
