package design.test.tutorials_17_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_16_0_0.AuthService;
import design.tutorials_16_0_2.AuthLink;
import design.tutorials_16_0_2.impl.Level1AuthLink;
import design.tutorials_16_0_2.impl.Level2AuthLink;
import design.tutorials_16_0_2.impl.Level3AuthLink;
import design.tutorials_17_0_1.XiaoEr;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiTest {

    @Test
    public void test(){
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(1);
        xiaoEr.order(2);
        xiaoEr.order(3);
        xiaoEr.order(4);

        // 下单
        xiaoEr.placeOrder();
    }

}
