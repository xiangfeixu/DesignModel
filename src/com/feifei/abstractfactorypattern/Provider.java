package com.feifei.abstractfactorypattern;

/**
 * 定义生产者
 * @author xuxiangfei
 * @date 2020/4/6
 */
public interface Provider {

    Sender produce();
}
