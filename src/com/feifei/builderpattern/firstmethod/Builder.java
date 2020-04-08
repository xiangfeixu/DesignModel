package com.feifei.builderpattern.firstmethod;

/**
 * 建造者抽象类
 * 定义建造工序，不包含实现细节
 * @author xuxiangfei
 * @date 2020/4/6
 */
public abstract class Builder {

    //地基
    abstract void methodA();

    //主体工程
    abstract void methodB();

    //装修工程
    abstract void methodC();

    //门窗工程
    abstract void methodD();

    //获取产品
    abstract Product getProduct();

}
