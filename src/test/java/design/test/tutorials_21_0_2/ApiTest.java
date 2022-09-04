package design.test.tutorials_21_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_20_0_0.Admin;
import design.tutorials_20_0_0.ConfigFile;
import design.tutorials_20_0_0.ConfigOriginator;
import design.tutorials_21_0_2.LotteryResult;
import design.tutorials_21_0_2.LotteryService;
import design.tutorials_21_0_2.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_draw() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("1000000101010019");
        logger.info("Result:{}", JSON.toJSONString(result));
    }
}
