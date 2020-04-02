package com.feifei.proxypattern.staticproxy;

/**
 * 歌星
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class LDHStar implements IStar {
    @Override
    public void sing() {
        System.out.println("一想到你我就 哦哦哦 哦哦！");
    }
}
