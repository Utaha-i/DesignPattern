package com.utaha.designpattern.chain7.exthree.service;

import com.utaha.designpattern.chain7.exthree.OrderCreateCommand;
import com.utaha.designpattern.chain7.exthree.chain.OrderCreateChainContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderCreateChainContext<OrderCreateCommand> orderCreateChainContext;

    public void createOrder(OrderCreateCommand requestParam) {
        // 责任链模式: 执行订单创建参数验证
        orderCreateChainContext.handler(requestParam);
    }
}
