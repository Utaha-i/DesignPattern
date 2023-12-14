package com.utaha.designpattern.chain7.extwo;

import java.util.List;

/**
 * 校验接口
 */
public interface VerifyHandler {
    List<Object> verify(List<Object> allObjList);
}
