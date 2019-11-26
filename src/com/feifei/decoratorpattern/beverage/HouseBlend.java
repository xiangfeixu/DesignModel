package com.feifei.decoratorpattern.beverage;

/**
 * 星巴兹咖啡
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class HouseBlend extends BaseBeverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    /**
     * 获取消费价格
     *
     * @return 消费价格
     */
    @Override
    public double cost() {
        return 0.89;
    }
}
