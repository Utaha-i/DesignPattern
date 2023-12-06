package com.utaha.designpattern.adapter9.impl;


import com.utaha.designpattern.adapter9.MicroUSB;
import com.utaha.designpattern.adapter9.USBTypeC;

/**
 * 适配实现，最后是调用USBTypeC接口来充电
 */
public class MicroUSBAdapter implements MicroUSB {

    private final USBTypeC usbTypeC;

    public MicroUSBAdapter() {
        this.usbTypeC = new USBTypeC();
    }

    /**
     * 重新 USB接口的充电方法，用TypeC来充电
     */
    @Override
    public void charge() {
        //使用TypeC来充电
        usbTypeC.chargeTypeC();
    }
}