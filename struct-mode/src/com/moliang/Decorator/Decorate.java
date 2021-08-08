package com.moliang.Decorator;

/**
 * @author zhang qing
 * @date 2021/8/8 14:22
 */
public class Decorate extends Person {

    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
