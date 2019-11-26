package com.feifei.decoratorpattern.beverage;

/**
 * 饮料超类
 * @author xuxiangfei
 * @date 2019/11/1
 */
public abstract class BaseBeverage {

    String description = "Unknow beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 获取消费价格
     * @return 消费价格
     */
    public abstract double cost();
}
