package com.utaha.designpattern.chain7.exthree.impl;

import com.utaha.designpattern.chain7.exthree.OrderCreateChainHandler;
import com.utaha.designpattern.chain7.exthree.OrderCreateCommand;
import org.springframework.stereotype.Component;

/**
 * 订单创建商品 SKU 库存验证
 */
@Component
public final class OrderCreateProductSkuStockChainHandler implements OrderCreateChainHandler<OrderCreateCommand> {

    @Override
    public void handler(OrderCreateCommand requestParam) {
        // 逻辑执行
        System.out.println("订单创建商品 SKU 库存验证");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}