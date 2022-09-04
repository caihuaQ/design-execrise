package design.test.tutorials_22_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_21_0_2.LotteryResult;
import design.tutorials_21_0_2.LotteryService;
import design.tutorials_21_0_2.LotteryServiceImpl;
import design.tutorials_22_0_0.ActivityService;
import design.tutorials_22_0_0.Status;
import design.tutorials_22_0_2.Result;
import design.tutorials_22_0_2.StateHandler;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, Status.Editing);

        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Editing2Open() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.open(activityId, Status.Editing);

        logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
