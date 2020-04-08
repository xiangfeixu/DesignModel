package com.feifei.builderpattern.firstmethod;

/**
 * 具体建造者
 * 本例中相当于工人
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class ConcreteBuilder extends Builder{

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    void methodA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void methodB() {
        product.setBuildB("主体");
        System.out.println("主体");
    }

    @Override
    void methodC() {
        product.setBuildC("装修");
        System.out.println("装修");
    }

    @Override
    void methodD() {
        product.setBuildD("门窗");
        System.out.println("门窗");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
