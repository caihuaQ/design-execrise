package design.test.tutorials_12_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_11_0_2.domain.model.aggregates.TreeRich;
import design.tutorials_11_0_2.domain.model.vo.EngineResult;
import design.tutorials_11_0_2.domain.model.vo.TreeNode;
import design.tutorials_11_0_2.domain.model.vo.TreeNodeLink;
import design.tutorials_11_0_2.domain.model.vo.TreeRoot;
import design.tutorials_11_0_2.domain.service.engine.IEngine;
import design.tutorials_11_0_2.domain.service.engine.impl.TreeEngineHandle;
import design.tutorials_12_0_1.LoginSsoDecorator;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator(){
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu","t");
        System.out.println("登陆校验："+request+(success ? "放行":"拦截"));
    }

}
