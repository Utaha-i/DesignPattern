package com.utaha.designpattern.chain7.exthree.impl;

import com.utaha.designpattern.chain7.exthree.OrderCreateChainHandler;
import com.utaha.designpattern.chain7.exthree.OrderCreateCommand;
import org.springframework.stereotype.Component;

/**
 * 订单创建参数必填检验
 */
@Component
public final class OrderCreateParamNotNullChainHandler implements OrderCreateChainHandler<OrderCreateCommand> {

    @Override
    public void handler(OrderCreateCommand requestParam) {
        //逻辑执行
        System.out.println("参数必填校验");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}