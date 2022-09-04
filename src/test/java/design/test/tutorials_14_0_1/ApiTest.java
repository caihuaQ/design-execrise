package design.test.tutorials_14_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_14_0_1.ActivityController;
import design.tutorials_14_0_2.Activity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_LoginSsoDecorator(){
        Long req = 10001L;
        Activity activity = activityController.queryActivityInfo(req);
        logger.info("测试结果：{} {}",req, JSON.toJSONString(activity));
    }

}
