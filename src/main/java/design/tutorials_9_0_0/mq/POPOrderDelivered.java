package design.tutorials_9_0_0.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import sun.dc.pr.PRError;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单妥协消息
 */
@Data
public class POPOrderDelivered {

    private String uId;         //用户ID
    private String orderId;     //订单号
    private Date orderTime;     //下单时间
    private Date sku;           //商品
    private Date skuName;       //商品名称
    private BigDecimal decimal; //金额

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
