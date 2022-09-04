package design.test.tutorials_12_0_2;

import design.tutorials_12_0_0.SsoInterceptor;
import design.tutorials_12_0_2.LoginSsoDecorator;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator(){
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu","t");
        System.out.println("登陆校验："+request+(success ? "放行":"拦截"));
    }

}
