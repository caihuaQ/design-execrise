package design.tutorials_21_0_2.event.listener;

import design.tutorials_21_0_2.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MQEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户{}摇号结果（MQ）：{}",result.getUId(),result.getMsg());
    }
}
