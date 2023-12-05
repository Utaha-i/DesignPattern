package com.example.designpattern.utaha.decorator4.condiment;

import com.utaha.decorator4.beverage.Beverage;

import java.math.BigDecimal;

/**
 * 奶泡调料类（继承自CondimentDecorator）
 */
public class Whip extends CondimentDecorator {

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    /**
     * 构造器初始化饮料变量
     * 奶泡调料类
     * @param beverage 饮料抽象类
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 在原来饮料的基础上添加上Whip描述（原来的饮料加入Whip调料，被Whip调料装饰）
     * @return 金额
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    /**
     * 在原来饮料的基础上加上Whip的价格（原来的饮料加入Whip调料，被Whip调料装饰）
     * @return 金额
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.4").add(beverage.cost());
    }
}