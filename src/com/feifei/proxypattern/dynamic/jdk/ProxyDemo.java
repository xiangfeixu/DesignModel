package com.feifei.proxypattern.dynamic.jdk;


/**
 * 动态代理模式示例
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class ProxyDemo {

    public static void main(String[] args) {
        GunDog gunDog = new GunDog();
        IDog dog =  MyProxyFactory.getProxy(gunDog);
        dog.run();
    }
}
