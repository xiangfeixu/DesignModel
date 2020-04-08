package com.feifei.builderpattern.firstmethod;

/**
 * 指挥者
 * 指定产品的装配顺序，生成产品
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Director {


    /**
     * 创建产品
     * @param builder 建造者
     * @return 产品
     */
    public Product create(Builder builder) {
        builder.methodA();
        builder.methodB();
        builder.methodC();
        builder.methodD();
        return builder.getProduct();
    }
}
