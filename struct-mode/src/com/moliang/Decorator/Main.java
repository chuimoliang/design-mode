package com.moliang.Decorator;

/**
 * @author zhang qing
 * @date 2021/8/8 14:26
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("末凉");
        Decorate decorate = new Decorate();
        Coat coat = new Coat();
        Shoe shoe = new Shoe();

        decorate.decorate(person);
        coat.decorate(decorate);
        shoe.decorate(coat);

        shoe.show();
    }

}
