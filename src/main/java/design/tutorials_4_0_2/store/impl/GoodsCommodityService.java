package design.tutorials_4_0_2.store.impl;

import com.alibaba.fastjson.JSON;
import design.tutorials_4_0_0.goods.DeliverReq;
import design.tutorials_4_0_0.goods.GoodsService;
import design.tutorials_4_0_2.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess =  goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[实物商品] => uId: {} commodity: {} bizId:{} extMap:{}",uId,commodityId,bizId, JSON.toJSON(extMap));
        logger.info("测试结果[实物商品]：{}",isSuccess);

        if(!isSuccess){
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(String uId){
        return "花花";
    }

    private String queryUserPhoneNumber(String uId){
        return "15200101232";
    }
}
