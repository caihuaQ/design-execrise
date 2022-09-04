package design.tutorials_10_0_1.channel;

import design.tutorials_10_0_1.mode.IPayMode;

import java.math.BigDecimal;

public class WxPay extends Pay {

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String traceId, BigDecimal amount) {
        logger.info("模拟微信渠道支付划账开始。uId：{} traceId：{} amount：{}", uId, traceId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟微信渠道支付风险控制。uId：{} traceId：{} amount：{}", uId, traceId, amount);
        if(!security){
            logger.info("模拟微信渠道支付划账拦截。uId：{} traceId：{} amount：{}", uId, traceId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道支付划账成功。uId：{} traceId：{} amount：{}", uId, traceId, amount);
        return "0000";
    }
}
