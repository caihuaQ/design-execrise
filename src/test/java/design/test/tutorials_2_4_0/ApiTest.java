package design.test.tutorials_2_4_0;

import com.alibaba.fastjson.JSON;
import design.tutorials_2_3_0.CashCard;
import design.tutorials_2_3_0.CreditCard;
import design.tutorials_2_4_0.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CashCard(){
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年1班");
        logger.info("查询结果：{}", JSON.toJSONString(map));
    }

}
