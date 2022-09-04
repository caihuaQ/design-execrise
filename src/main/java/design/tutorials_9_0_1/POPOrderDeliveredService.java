package design.tutorials_9_0_1;

import com.alibaba.fastjson.JSON;
import design.tutorials_9_0_0.mq.OrderMq;
import design.tutorials_9_0_0.mq.POPOrderDelivered;

public class POPOrderDeliveredService {

    public void onMessage(String message){

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getUId();
        mq.getOrderId();
        mq.getOrderTime();

        // ...处理自己的业务
    }
}
