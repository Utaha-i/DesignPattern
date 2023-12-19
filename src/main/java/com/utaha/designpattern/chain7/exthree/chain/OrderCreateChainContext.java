package com.utaha.designpattern.chain7.exthree.chain;

import com.utaha.designpattern.chain7.exthree.OrderCreateChainHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public final class OrderCreateChainContext<T> implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    private final List<OrderCreateChainHandler> orderCreateChainHandlerContainer = new ArrayList();
    /**
     * 责任链组件执行
     *
     * @param requestParam 请求参数
     */
    public void handler(T requestParam) {
        // 此处根据 Order 实际值进行排序处理
        orderCreateChainHandlerContainer.stream()
                .sorted(Comparator.comparing(Ordered::getOrder)).forEach(each -> each.handler(requestParam));
    }
    @Override
    public void run(String... args) throws Exception {
      	// 通过 Spring 上下文容器，获取所有 CreateOrderChainContext Bean
        Map<String, OrderCreateChainHandler> chainFilterMap = applicationContext.getBeansOfType(OrderCreateChainHandler.class);
      	// 将对应 Bean 放入责任链上下文容器中
        chainFilterMap.forEach((beanName, bean) -> orderCreateChainHandlerContainer.add(bean));
    }
}
