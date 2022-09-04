package design.tutorials_12_0_0;

public class SsoInterceptor implements HandleInterceptor {
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        //模拟获取cookie
        String ticket = request.substring(1,8);
        //模拟校验
        return ticket.equals("success");
    }
}
