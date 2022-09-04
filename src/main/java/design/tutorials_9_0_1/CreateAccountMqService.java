package design.tutorials_9_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_9_0_0.mq.CreateAccount;

public class CreateAccountMqService {

    public void onMessage(String message){

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        //... 处理自己的业务
    }
}
