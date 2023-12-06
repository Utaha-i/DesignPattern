package com.utaha.designpattern.decorator4.condiment;


import com.utaha.designpattern.decorator4.beverage.Beverage;

import java.math.BigDecimal;

/**
 * 摩卡调料类（继承自CondimentDecorator）
 */
public class Mocha extends CondimentDecorator {

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    /**
     * 构造器初始化饮料变量
     * 摩卡调料类
     * @param beverage 饮料抽象类
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 在原来饮料的基础上添加上Mocha描述（原来的饮料加入Mocha调料，被Mocha调料装饰）
     * @return 描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    /**
     * 在原来饮料的基础上加上Mocha的价格（原来的饮料加入Mocha调料，被Mocha调料装饰）
     * @return 金额
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.2").add(beverage.cost());
    }
}
