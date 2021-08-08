package com.moliang.builder;

/**
 * @author zhang qing
 * @date 2021/8/5 19:59
 */
public class Main {

    public void doSomething(Builder builder) {
        new Director().build(builder);
        Product product = builder.getProduct();
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new RealBuilder();
        director.build(builder);
        Product product = builder.getProduct();
        /**
         * 优点
         *  - 可以根据实际需求创建多个Builder类型, 根据需求组装Product, 使用product无需知道内部组成
         *  - 具体的建造者类之间相互独立, 有利于系统的扩展
         *  - 可以对建造过程逐步细化，而不对其他模块产生任何影响
         *
         *  使用场景
         *   - 对象的内部结构复杂, 使用建造者模式隔离复杂的对象的创建
         *   - 相同的方法不同的执行顺序产生不同的事件结果
         */

    }

}
