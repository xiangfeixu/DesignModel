package com.feifei.factorypattern.multifactory;

import com.feifei.factorypattern.normalfactory.Sender;

/**
 * 工厂测试
 * @author xuxiangfei
 * @date 2020/4/3
 */
public class FactoryTest {

    public static void main(String[] args) {
        MultiSendFactory multiSendFactory = new MultiSendFactory();
        Sender mailSender = multiSendFactory.produceMail();
        Sender smsSender = multiSendFactory.produceSms();
        mailSender.send();
        smsSender.send();
    }
}
