package design.test.tutorials_9_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_8_0_0.Singleton_07;
import design.tutorials_9_0_0.mq.CreateAccount;
import design.tutorials_9_0_2.MQAdapter;
import design.tutorials_9_0_2.RebateInfo;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ApiTest {

    @Test
    public void test_MQAdapter() throws Exception {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2020-06-01 23:20:16");

        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("15");
        createAccount.setAddress("上海市松江区");
        createAccount.setAccountDate(parse);
        createAccount.setDesc("在家开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId","number");
        link01.put("bizId","number");
        link01.put("bizTime","accountDate");
        link01.put("desc","desc");

        RebateInfo rebateInfo01 = MQAdapter.filter(createAccount.toString(),link01);
        System.out.println("mq.createAccount(适配前)" + createAccount.toString());
        System.out.println("mq.createAccount(适配后)" + JSON.toJSONString(rebateInfo01));
    }
}
