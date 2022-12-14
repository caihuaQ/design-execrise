package design.tutorials_21_0_1;

import design.tutorials_21_0_0.MinibusTargetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class LotteryServiceImpl implements LotteryService {

    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    public LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //发短信
        logger.info("给用户{}发送短信通知：{}",uId,lottery);
        //发送MQ消息
        logger.info("记录用户{}摇号结果（MQ）:{}",uId,lottery);
        //结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
