package com.feifei.proxypattern.dynamic.jdk;


import java.lang.reflect.Proxy;

/**
 * 自定义代理工厂
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class MyProxyFactory {

    /**
     * 获取代理对象
     * @return 代理对象
     */
    public static <T>T getProxy(T target) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(target);
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myInvocationHandler);
        return (T)o;
    }
}
