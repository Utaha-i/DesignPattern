package com.example.designpattern.utaha.abstractFactory3;

import com.utaha.abstractFactory3.pojo.coffee.Coffee;
import com.utaha.abstractFactory3.pojo.dessert.Dessert;

/**
 * 抽象工厂
 *
 * 类纬度为：产品族(同一品牌) 美式品牌、意大利品牌
 *
 * 方法纬度为：产品等级(同一类产品) 咖啡、甜点
 *
 * 普通工厂只有品牌纬度，少了产品纬度
 *
 */
public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}