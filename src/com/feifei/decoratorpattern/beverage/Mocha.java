package com.feifei.decoratorpattern.beverage;

/**
 * 摩卡饮料
 * 这是一个装饰者，用来装饰
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class Mocha extends BaseCondiment{

    /**
     * 定义一个超类应用用来接收被装饰对象
     */
    BaseBeverage beverage;


    /**
     * 摩卡饮料
     * 使用有参构造器初始化beverage对象
     * @param beverage 被包装的饮料
     */
    public Mocha(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 获取饮料描述
     *  这里先使用委托的方式获取被包装对象的属性，再附加上包装信息
     * @return 饮料描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 获取消费价格
     * @return 消费价格
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
