package com.utaha.designpattern.chain7.extwo.impl;

import com.utaha.designpattern.chain7.extwo.VerifyHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 敏感字段校验
 */
@Component
public class SexyVerifyHandler implements VerifyHandler {
    @Override
    public List<Object> verify(List<Object> allObjList) {
        System.out.println("进入了敏感校验");
        for (Object o : allObjList) {
            if (o ==null){
                throw new RuntimeException("拦截器拦截xxx为敏感字段");
            }
        }
        return allObjList;
    }
}
