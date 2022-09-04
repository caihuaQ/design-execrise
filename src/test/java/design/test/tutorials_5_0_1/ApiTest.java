package design.test.tutorials_5_0_1;

import design.tutorials_4_0_2.StoreFactory;
import design.tutorials_4_0_2.store.ICommodity;
import design.tutorials_4_0_2.store.impl.CouponCommodityService;
import design.tutorials_5_0_1.CacheClusterServiceImpl;
import design.tutorials_5_0_1.CacheService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CacheServiceAfterImpl(){
        CacheService cacheService = new CacheClusterServiceImpl();

        cacheService.set("user_name_01","菜比",1);
        String val01 = cacheService.get("user_name_01", 1);
        logger.info("缓存集群升级，测试结果：{}",val01);
    }

}
