package com.feifei.singletonpattern;


/**
 * 懒汉模式升级版
 * 双重检查锁定
 * @author xuxiangfei
 * @date 2019/8/22
 */
public class SingletonDemo3 {

    private String name;

    /**
     * 声明一个实例变量
     */
    private static SingletonDemo3 instance;

    /**
     * 私有化构造器（核心）
     */
    private SingletonDemo3() {}

    public static SingletonDemo3 getInstance(){
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        int i = 0;
        while(i++ < 100) {
            System.out.println("i, = " + i + SingletonDemo3.getInstance().setName("name"+i).toString() );
            System.out.println("i, = " + i + SingletonDemo3.getInstance().getName());
        }
    }

    public String getName() {
        return name;
    }

    public SingletonDemo3 setName(String name) {
        this.name = name;
        return this;
    }

}


