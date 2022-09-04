package design.tutorials_12_0_2;

import design.tutorials_12_0_0.HandleInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoDecorator {

    private Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("duoduo", "queryUserInfo");
    }

    public LoginSsoDecorator(HandleInterceptor handleInterceptor) {
        super(handleInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if(!success){
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登陆方法访问拦截校验：{} {}", userId, method);
        //模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
