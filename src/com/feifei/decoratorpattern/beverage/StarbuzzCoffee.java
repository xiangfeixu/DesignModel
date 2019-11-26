package com.feifei.decoratorpattern.beverage;

/**
 * 咖啡店
 * 利用包装模式制造各种咖啡
 * @author xuxiangfei
 * @date 2019/11/4
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        // 先定一杯浓缩咖啡不加任何饮料
        BaseBeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        // 再来一杯深度烘焙咖啡
        BaseBeverage beverage2 = new  DarkRoast();
        // 先用摩卡包装它
        beverage2 = new Mocha(beverage2);
        // 再次用摩卡包装
        beverage2 = new Mocha(beverage2);
        // 最后奶油包装
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        //星巴兹咖啡
        BaseBeverage beverage3 = new HouseBlend();
        // 使用豆浆包装星巴兹咖啡
        beverage3 = new Soy(beverage3);
        // 再使用摩卡包装
        beverage3 = new Mocha(beverage3);
        // 最后使用奶油包装
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}
