package design.tutorials_9_0_0.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;
import sun.dc.pr.PRError;

import java.util.Date;

@Data
public class OrderMq {

    private String uid;             //用户ID
    private String sku;             //商品
    private String orderId;         //订单ID
    private Date createOrderTime;   //下单时间

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
