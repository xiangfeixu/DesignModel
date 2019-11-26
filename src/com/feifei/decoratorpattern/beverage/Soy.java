package com.feifei.decoratorpattern.beverage;

/**
 * 豆浆
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class Soy extends BaseCondiment{


    /**
     * 定义一个超类应用用来接收被装饰对象
     */
    BaseBeverage beverage;


    /**
     * 豆浆
     * 使用有参构造器初始化beverage对象
     * @param beverage
     */
    public Soy(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 获取饮料描述
     *
     * @return 饮料描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * 获取消费价格
     *
     * @return 消费价格
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.66;
    }
}
