package design.test.tutorials_21_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_20_0_0.Admin;
import design.tutorials_20_0_0.ConfigFile;
import design.tutorials_20_0_0.ConfigOriginator;
import design.tutorials_21_0_1.LotteryResult;
import design.tutorials_21_0_1.LotteryService;
import design.tutorials_21_0_1.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
