package com.utaha.designpattern.chain7.extwo.impl;

import com.utaha.designpattern.chain7.extwo.VerifyHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 非空校验拦截器
 */
@Component
public class EmptyVerifyHandler implements VerifyHandler {
    @Override
    public List<Object> verify(List<Object> allObjList) {
        System.out.println("进入了非空校验");
        for (Object o : allObjList) {
            if (o ==null){
                throw new RuntimeException("拦截器拦截xxx不能为空");
            }
        }
        return allObjList;
    }
}