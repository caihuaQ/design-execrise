package design.test.tutorials_4_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_4_0_1.AwardReq;
import design.tutorials_4_0_1.AwardRes;
import design.tutorials_4_0_1.PrizeController;
import design.tutorials_4_0_2.StoreFactory;
import design.tutorials_4_0_2.store.ICommodity;
import design.tutorials_4_0_2.store.impl.CouponCommodityService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ApiTest {

    @Test
    public void test_StoreFactory_01() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1、优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001","EGM1021123185415213215","121456512318",null);

        //2、实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        commodityService_2.sendCommodity("10001","AQY1XASDIWEJDOAJWIDJIW","10515156125165",new HashMap<String,String>(){{
            put("consigneeUserName"," op");
            put("consigneeUserPhone","12541631541");
            put("consigneeUserAddress","吉林省,长春市");
        }});


        //3、第三方兑换卡
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY121456156401564151",null,null);
    }

    @Test
    public void test_StoreFactory_02() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        //1、优惠券
        ICommodity commodityService = storeFactory.getCommodityService(CouponCommodityService.class);
        commodityService.sendCommodity("10001","EGM51D56468541651521","156418594851",null);

    }
}
