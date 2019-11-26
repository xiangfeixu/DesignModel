package com.feifei.decoratorpattern.beverage;

/**
 * 奶油
 * 一种调料 用来包装咖啡对象
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class Whip extends BaseBeverage{

    /**
     * 定义一个超类应用用来接收被装饰对象
     */
    BaseBeverage beverage;


    /**
     * 奶油
     * 使用有参构造器初始化beverage对象
     * @param beverage
     */
    public Whip(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 获取饮料描述
     *  这里先使用委托的方式获取被包装对象的属性，再附加上包装信息
     * @return 饮料描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    /**
     * 获取消费价格
     *
     * @return 消费价格
     */
    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
