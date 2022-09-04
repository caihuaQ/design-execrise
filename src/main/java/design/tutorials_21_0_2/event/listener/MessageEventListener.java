package design.tutorials_21_0_2.event.listener;

import design.tutorials_21_0_2.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户{}发送短信通知（短信）：{}",result.getUId(), result.getMsg());
    }
}
