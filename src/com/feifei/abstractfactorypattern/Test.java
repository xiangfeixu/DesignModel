package com.feifei.abstractfactorypattern;

/**
 * 测试类
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Test {

    public static void main(String[] args) {
        SenderMailFactory senderMailFactory = new SenderMailFactory();
        Sender produce = senderMailFactory.produce();
        produce.sender();
    }
}
