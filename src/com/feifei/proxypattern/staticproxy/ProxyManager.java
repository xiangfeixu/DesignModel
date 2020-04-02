package com.feifei.proxypattern.staticproxy;

/**
 * 静态代理类
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class ProxyManager implements IStar {

    private IStar iStar;

    public ProxyManager() {
        super();
    }

    public ProxyManager(IStar iStar) {
        super();
        this.iStar = iStar;
    }

    @Override
    public void sing() {
        System.out.println("唱歌前准备");
        iStar.sing();
        System.out.println("歌唱表演结束");
    }
}
