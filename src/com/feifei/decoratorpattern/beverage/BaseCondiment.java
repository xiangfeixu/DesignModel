package com.feifei.decoratorpattern.beverage;

/**
 * 调料
 * 这是一个被装饰者
 * @author xuxiangfei
 * @date 2019/11/1
 */
public abstract class BaseCondiment extends BaseBeverage {

    /**
     * 获取饮料描述
     * @return 饮料描述
     */
    @Override
    public abstract String getDescription();
}
