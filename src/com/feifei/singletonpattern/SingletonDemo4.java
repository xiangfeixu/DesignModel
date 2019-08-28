package com.feifei.singletonpattern;

/**
 * 静态内部类实现
 * @author xuxiangfei
 * @date 2019/8/27
 */
public class SingletonDemo4 {

    /**
     * 私有化构造器
     */
    private SingletonDemo4(){}

    /**
     * 对外提供的获取唯一单例的方法
     * @return 单例对象
     */
    public static  SingletonDemo4 getInstance() {
        return LazyHolder.INSTANCE;
    }


    /**
     * 静态内部类包裹唯一实例变量
     *
     */
    private static class LazyHolder {

        /**
         * 初始化一个静态示例
         */
        private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonDemo4{");
        sb.append('}');
        return sb.toString();
    }
}
