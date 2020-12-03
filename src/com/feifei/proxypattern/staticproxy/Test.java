package com.feifei.proxypattern.staticproxy;

/**
 * 测试静态代理
 * 静态代理总结:
 * 优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 缺点: 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class Test {

    public static void main(String[] args) {
        LDHStar ldhStar = new LDHStar();
        IStar proxy = new ProxyManager(ldhStar);
        proxy.sing();
    }
}
