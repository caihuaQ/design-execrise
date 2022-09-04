package design.tutorials_4_0_0.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverReq {

    private String userName; //用户姓名
    private String userPhone; //用户手机
    private String sku; //商品SKU
    private String orderId; //订单ID
    private String consigneeUserName; //收货姓名
    private String consigneeUserPhone; //收货人手机
    private String consigneeUserAddress; //获取人地址

}
