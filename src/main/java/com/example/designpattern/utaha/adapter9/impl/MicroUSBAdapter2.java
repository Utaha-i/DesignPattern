package com.example.designpattern.utaha.adapter9.impl;

import com.utaha.adapter9.MicroUSB;
import com.utaha.adapter9.USBTypeC;

/**
 * 方然除了上面这种写法，还有一种继承的写法。
 *
 * 这两种写法主要是继承和组合（聚合）的区别。
 */
public class MicroUSBAdapter2 extends USBTypeC implements MicroUSB {

    /**
     * 重新 USB接口的充电方法，用TypeC来充电
     */
    @Override
    public void charge() {
        //使用TypeC来充电
        this.chargeTypeC();
    }

}