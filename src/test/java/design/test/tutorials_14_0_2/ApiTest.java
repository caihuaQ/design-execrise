package design.test.tutorials_14_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_12_0_0.SsoInterceptor;
import design.tutorials_12_0_2.LoginSsoDecorator;
import design.tutorials_14_0_2.Activity;
import design.tutorials_14_0_2.ActivityController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}",req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }

}
