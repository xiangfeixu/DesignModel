package com.feifei.builderpattern.firstmethod;

/**
 * 测试类
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }
}
