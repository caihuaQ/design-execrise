package design.test.tutorials_2_3_0;

import com.alibaba.fastjson.JSON;
import design.tutorials_2_2_0.ICalculationArea;
import design.tutorials_2_2_0.impl.CalculationAreaExt;
import design.tutorials_2_3_0.CashCard;
import design.tutorials_2_3_0.CreditCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CashCard(){
        CashCard cashCard = new CashCard();
        //提现
        cashCard.withdrawal("100001",new BigDecimal(100));
        //储蓄
        cashCard.rechange("100001",new BigDecimal(100));
        List<String> tradeFlow = cashCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }

    @Test
    public void test_CreditCard(){
        CreditCard creditCard = new CreditCard();
        //支付
        creditCard.withdrawal("100001",new BigDecimal(100));
        //还款
        creditCard.rechange("100001",new BigDecimal(100));
        //交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        logger.info("查询交易流水,{}",JSON.toJSONString(tradeFlow));
    }

}
