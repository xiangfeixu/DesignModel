package com.feifei.builderpattern.secondmethod;


/**
 * 建造者
 * @author xuxiangfei
 * @date 2020/4/6
 */
abstract class Builder {

    //汉堡
    abstract Builder buildA(String ms);
    //饮料
    abstract Builder buildB(String ms);
    //薯条
    abstract Builder buildC(String ms);
    //产品
    abstract Builder buildD(String ms);
    //获取套餐
    abstract Product build();
}
