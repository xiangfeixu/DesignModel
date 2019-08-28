package com.feifei.singletonpattern;

/**
 * 懒汉模式
 * 等调用的时候再进行实例初始化
 * @author xuxiangfei
 * @date 2019/8/22
 */
public class SingletonDemo1 {

    /**
     * 声明对象引用
     */
    private static SingletonDemo1 instance;

    /**
     * 私有化构造器
     */
    private SingletonDemo1(){}

    public static SingletonDemo1 getInstace() {
        if (instance == null) {
            instance = new SingletonDemo1();
        }
        return instance;
    }
}
