package design.tutorials_9_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_9_0_0.mq.OrderMq;

public class OrderMqService {

    public void onMessage(String message){

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ...处理自己的业务
    }
}
