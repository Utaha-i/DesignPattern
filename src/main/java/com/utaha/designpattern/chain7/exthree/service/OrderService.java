package com.utaha.designpattern.chain7.exthree.service;

import com.utaha.designpattern.chain7.exthree.OrderCreateCommand;

public interface OrderService {

    void createOrder(OrderCreateCommand requestParam);

}
