package com.example.designpattern.utaha.decorator4.beverage;

import java.math.BigDecimal;

/**
 * 饮料抽象类
 * @date 2023年3月16日 11:20:56
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * cost方法是用来返回饮料的价钱（需在具体类中自己实现）
     * @return 金额
     */
    public abstract BigDecimal cost();
}