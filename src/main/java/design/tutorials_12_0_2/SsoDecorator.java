package design.tutorials_12_0_2;

import design.tutorials_12_0_0.HandleInterceptor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class SsoDecorator implements HandleInterceptor {

    private HandleInterceptor handleInterceptor;

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handleInterceptor.preHandle(request, response, handler);
    }

}
