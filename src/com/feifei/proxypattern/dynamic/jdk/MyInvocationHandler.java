package com.feifei.proxypattern.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自定义方法执行方式
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtils.method1();
        method.invoke(target, args);
        DogUtils.method2();
        return null;
    }
}
