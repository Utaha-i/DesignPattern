package com.utaha.designpattern.chain7.extwo.chain;

import com.utaha.designpattern.chain7.extwo.VerifyHandler;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 构建责任链
 * 1.实现自 InitializingBean 接口，在对应实现方法中获取 IOC 容器中类型为 VerifyHandler 的 Bean，
 * 也就是 EmptyVerifyHandler、SexyVerifyHandler。
 * 2.将 VerifyHandler 类型的 Bean 添加到处理器链容器中。
 * 3.定义校验方法 verify()，对入参数据展开处理器链的全部调用，如果过程中发现已无需要验证的数据，直接返回。
 */
@Component
public class VerifyHandlerChain implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    private final List<VerifyHandler> verifyHandlerList = new ArrayList<>();

    @Override
    public void afterPropertiesSet() {
        Map<String, VerifyHandler> beansOfType = applicationContext.getBeansOfType(VerifyHandler.class);
        //map中的val（校验器的实例类），依次填充到list中
        beansOfType.forEach((key, val) -> verifyHandlerList.add(val));
    }

    /**
     * 定义校验方法 verify()，对入参数据展开处理器链的全部调用，如果过程中发现已无需要验证的数据，直接返回。
     *
     * @param allObjList 需要校验的list
     * @return 校验的结果list
     */
    public List<Object> verify(List<Object> allObjList) {
        List<Object> resList = null;
        //循环校验每一个校验器
        for (VerifyHandler verifyHandler : verifyHandlerList) {
            resList = verifyHandler.verify(allObjList);
            //如果需要校验的List为空则退出所有循环，直接return
            if (CollectionUtils.isEmpty(resList)) {
                return resList;
            }
        }
        return resList;
    }

}
