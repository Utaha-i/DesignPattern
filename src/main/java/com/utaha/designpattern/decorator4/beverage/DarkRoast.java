package com.utaha.designpattern.decorator4.beverage;

import java.math.BigDecimal;

/**
 * 深焙咖啡类（一种具体的饮料）
 */
public class DarkRoast extends Beverage {

    /**
     * 说明他是DarkRoast饮料
     */
    public DarkRoast() {
        description = "DarkRoast";
    }

    /**
     * 实现cost方法，用来返回DarkRoast（深焙咖啡）的价格
     * @return 金额
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("3.00");
    }
}