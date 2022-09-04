package design.test.tutorials_10_0_2;

import design.tutorials_10_0_1.channel.AliPay;
import design.tutorials_10_0_1.channel.Pay;
import design.tutorials_10_0_1.channel.WxPay;
import design.tutorials_10_0_1.mode.PayFaceMode;
import design.tutorials_10_0_1.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay aliPay = new AliPay(new PayFingerprintMode());
        aliPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));

    }

}
