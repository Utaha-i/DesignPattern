package com.utaha.designpattern.decorator4.client;


import com.utaha.designpattern.decorator4.beverage.Beverage;
import com.utaha.designpattern.decorator4.beverage.DarkRoast;
import com.utaha.designpattern.decorator4.beverage.Espresso;
import com.utaha.designpattern.decorator4.condiment.Mocha;
import com.utaha.designpattern.decorator4.condiment.Soy;
import com.utaha.designpattern.decorator4.condiment.Whip;
import com.utaha.designpattern.decorator4.beverage.Decaf;

import java.math.BigDecimal;

/**
 * 咖啡馆（供应咖啡）
 */
public class StarbucksCoffee {

    public static void main(String[] args) {
        //订一杯Espresso(2.00)，不需要调料，打印出它的描述与价钱。
        Beverage beverage = new Espresso();
        System.out.println("Description: " + beverage.getDescription() + " $" + beverage.cost());

        //制造出一个DarkRoast(3.00)对象,用Mocha(0.2)装饰它,用第二个Mocha(0.2)装饰它,用Whip(0.4)装饰它，打印出它的描述与价钱。
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        String description = beverage2.getDescription();
        BigDecimal cost = beverage2.cost();
        System.out.println("Description: " + description + " $" + cost);

        //再来一杯调料为豆浆(Soy 0.3)、摩卡(Mocha 0.2)、奶泡(Whip 0.4)的Decaf（低咖啡因咖啡 4.00），打印出它的描述与价钱。
        Beverage beverage3 = new Decaf();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("Description: " + beverage3.getDescription() + " $" + beverage3.cost());
    }
}