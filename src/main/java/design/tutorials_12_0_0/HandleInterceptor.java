package design.tutorials_12_0_0;

public interface HandleInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
