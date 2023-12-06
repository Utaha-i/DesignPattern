package com.utaha.designpattern.decorator4.condiment;


import com.utaha.designpattern.decorator4.beverage.Beverage;

/**
 * 调料装饰着抽象类（继承自饮料抽象类）
 * @date 2023年3月20日 17:45:14
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
     * 这样才能够用递归的方式来得到所选饮料的整体描述
     * @return 饮料描述
     */
    public abstract String getDescription();
}