package design.tutorials_2_3_0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 储蓄卡功能模拟
 */
public class CashCard {

    private Logger logger = LoggerFactory.getLogger(CashCard.class);

    /**
     * 提现
     */
    public String withdrawal(String orderId, BigDecimal amount){
        // 模拟支付成功
        logger.info("提现成功,单号:{} 金额:{}",orderId,amount);
        return "0000";
    }

    /**
     * 储蓄
     */
    public String rechange(String orderId, BigDecimal amount){
        //模拟充值成功
        logger.info("储蓄成功，单号：{} 金额：{}",orderId,amount);
        return "0000";
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
