package com.feifei.decoratorpattern.beverage;

/**
 * 深度烘焙咖啡
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class DarkRoast extends BaseBeverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    /**
     * 获取消费价格
     * @return 消费价格
     */
    @Override
    public double cost() {
        return 1;
    }
}
