package com.feifei.singletonpattern;

/**
 * 饿汉模式
 * 直接生成一个实例
 * @author xuxiangfei
 * @date 2019/8/22
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance = new SingletonDemo2();

    private SingletonDemo2(){}

    public static SingletonDemo2 getInstance() {
        return instance;
    }
}
