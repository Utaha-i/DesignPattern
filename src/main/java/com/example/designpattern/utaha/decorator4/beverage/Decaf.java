package com.example.designpattern.utaha.decorator4.beverage;

import java.math.BigDecimal;

/**
 * 低咖啡因咖啡类（一种具体的饮料）
 */
public class Decaf extends Beverage {

    /**
     * 说明他是Decaf饮料
     */
    public Decaf() {
        description = "Decaf";
    }

    /**
     * 实现cost方法，用来返回Decaf（低咖啡因咖啡）的价格
     * @return 金额
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("4.00");
    }
}