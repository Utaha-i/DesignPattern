package com.example.designpattern.utaha.abstractFactory3.client;

import com.utaha.abstractFactory3.AmericanDessertFactory;
import com.utaha.abstractFactory3.DessertFactory;
import com.utaha.abstractFactory3.ItalyDessertFactory;
import com.utaha.abstractFactory3.pojo.coffee.Coffee;
import com.utaha.abstractFactory3.pojo.dessert.Dessert;

/**
 * 咖啡馆（供应咖啡）
 */
public class StarbucksCoffee {

    public static void main(String[] args) {
        //模拟请求为美式
        String productType = "American";
        //模拟请求为咖啡
        String foodTpye = "Coffee";
        //默认工厂interface
        AmericanDessertFactory americanDessertFactory = null;
        ItalyDessertFactory italyDessertFactory = null;
        //第一步：先判断工厂类型
        if ("American".equals(productType)) {
            //美式甜点工厂
            americanDessertFactory = new AmericanDessertFactory();
            //第二步：判断工厂生产什么产品
            if ("Coffee".equals(foodTpye)) {
                //咖啡
                Coffee coffee = orderCoffee(americanDessertFactory);
                System.out.println("第一杯咖啡：" + coffee.toString());
            } else {
                //甜点
                Dessert dessert = orderDessert(americanDessertFactory);
                System.out.println("第一盘甜点：" + dessert.toString());
            }
        } else {
            //意大利风味甜点工厂
            italyDessertFactory = new ItalyDessertFactory();
            //.....同上
        }
    }

    /**
     * @param factory 需要哪个具体工厂生产咖啡
     * @return 要产生的咖啡子类
     */
    public static Coffee orderCoffee(DessertFactory factory) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * @param factory 需要哪个具体工厂生产甜点
     * @return 要产生的甜点子类
     */
    public static Dessert orderDessert(DessertFactory factory) {
        Dessert dessert = factory.createDessert();
        dessert.addMilk();
        dessert.addSugar();
        return dessert;
    }

}