package design.test.tutorials_11_0_1;

import design.tutorials_10_0_1.channel.AliPay;
import design.tutorials_10_0_1.channel.Pay;
import design.tutorials_10_0_1.channel.WxPay;
import design.tutorials_10_0_1.mode.PayFaceMode;
import design.tutorials_10_0_1.mode.PayFingerprintMode;
import design.tutorials_11_0_1.EngineController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("Oli09pLkdjh", "man", 29);
        logger.info("测试结果：{}", process);
    }

}
