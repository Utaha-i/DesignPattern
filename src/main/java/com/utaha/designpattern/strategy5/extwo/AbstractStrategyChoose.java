package com.utaha.designpattern.strategy5.extwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 策略选择器
 */
@Component
public class AbstractStrategyChoose implements ApplicationListener {

    @Autowired
    private ApplicationContext applicationContext;
    /**
     * 执行策略集合
     */
    private final Map<String, AbstractExecuteStrategy> abstractExecuteStrategyMap = new HashMap<>();

    /**
     * 根据 mark 查询具体策略
     *
     * @param mark 策略标识
     * @return 实际执行策略
     */
    public AbstractExecuteStrategy choose(String mark) {
        return Optional.ofNullable(abstractExecuteStrategyMap.get(mark)).orElseThrow(() -> new RuntimeException(String.format("[%s] 策略未定义", mark)));
    }

    /**
     * 根据 mark 查询具体策略并执行
     *
     * @param mark         策略标识
     * @param requestParam 执行策略入参
     * @param <REQUEST>    执行策略入参范型
     */
    public <REQUEST> void chooseAndExecute(String mark, REQUEST requestParam) {
        AbstractExecuteStrategy executeStrategy = choose(mark);
        executeStrategy.execute(requestParam);
    }

    /**
     * 根据 mark 查询具体策略并执行，带返回结果
     *
     * @param mark         策略标识
     * @param requestParam 执行策略入参
     * @param <REQUEST>    执行策略入参范型
     * @param <RESPONSE>   执行策略出参范型
     * @return RESPONSE
     */
    public <REQUEST, RESPONSE> RESPONSE chooseAndExecuteResp(String mark, REQUEST requestParam) {
        AbstractExecuteStrategy executeStrategy = choose(mark);
        return (RESPONSE) executeStrategy.executeResp(requestParam);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Map<String, AbstractExecuteStrategy> actual = applicationContext.getBeansOfType(AbstractExecuteStrategy.class);
        actual.forEach((beanName, bean) -> {
            AbstractExecuteStrategy beanExist = abstractExecuteStrategyMap.get(bean.mark());
            if (beanExist != null) {
                throw new RuntimeException(String.format("[%s] Duplicate execution policy", bean.mark()));
            }
            abstractExecuteStrategyMap.put(bean.mark(), bean);
        });
    }
}