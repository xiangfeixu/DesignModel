package com.feifei.builderpattern.secondmethod;



/**
 * 具体建造者
 * 麦当劳的服务员，组装成套餐
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class ConcreteBuilder extends Builder{

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    Builder buildA(String ms) {
        product.setBuildA(ms);
        return this;
    }

    @Override
    Builder buildB(String ms) {
        product.setBuildB(ms);
        return this;
    }

    @Override
    Builder buildC(String ms) {
        product.setBuildC(ms);
        return this;
    }

    @Override
    Builder buildD(String ms) {
        product.setBuildD(ms);
        return this;
    }

    @Override
    Product build() {
        return product;
    }
}
