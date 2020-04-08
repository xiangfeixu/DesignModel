package com.feifei.builderpattern.secondmethod;

/**
 * 测试类
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Test {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Product product = builder.buildA("牛肉煲").buildB("全家桶").buildD("冰淇淋").build();
        System.out.println(product);
    }
}
