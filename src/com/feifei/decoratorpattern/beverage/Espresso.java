package com.feifei.decoratorpattern.beverage;

/**
 * 浓缩咖啡
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class Espresso extends BaseBeverage{

    public Espresso() {
        description = "Espresso";
    }

    /**
     * 获取消费价格
     * @return 消费价格
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
