package design.tutorials_21_0_2;

import design.tutorials_21_0_0.MinibusTargetService;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
