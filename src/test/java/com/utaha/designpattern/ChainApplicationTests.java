package com.utaha.designpattern;

import com.utaha.designpattern.chain7.extwo.chain.VerifyHandlerChain;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ChainApplicationTests {

    @Autowired
    private VerifyHandlerChain verifyHandlerChain;

    @Test
    void contextLoads() {
        List<Object> verify = verifyHandlerChain.verify(Lists.newArrayList("kazusa", "utaha"));
        System.out.println(verify);
    }

}
