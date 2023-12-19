package com.utaha.designpattern.chain7.exthree;

import org.springframework.core.Ordered;

public interface OrderCreateChainHandler<T> extends Ordered {
    
    /**
     * 执行责任链逻辑
     *
     * @param requestParam 责任链执行入参
     */
    void handler(T requestParam);

}
