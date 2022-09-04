package design.tutorials_2_3_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 储蓄卡功能模拟
 */
public class CashCard extends BankCard{

    private Logger logger = LoggerFactory.getLogger(CashCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     */
    public String withdrawal(String orderId, BigDecimal amount){
        // 模拟支付成功
        logger.info("提现成功,单号:{} 金额:{}",orderId,amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储蓄
     */
    public String recharge(String orderId, BigDecimal amount){
        //模拟充值成功
        logger.info("储蓄成功，单号：{} 金额：{}",orderId,amount);
        return super.positive(orderId, amount);
    }

    public boolean checkRisk(String cardNo,String orderId, BigDecimal amount){
        //模拟风险校验
        logger.info("风险控制，卡号：{} 单号：{} 金额：{}", cardNo,orderId,amount);
        return true;
    }

    /**
     * 交易流水查询
     * @return
     */
    public List<String> tradeFlow(){
        logger.info("交易流水查询成功");
        ArrayList<String> tradeList = new ArrayList<>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }
}
