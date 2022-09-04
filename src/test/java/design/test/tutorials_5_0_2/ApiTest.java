package design.test.tutorials_5_0_2;

import design.tutorials_5_0_0.application.CacheService;
import design.tutorials_5_0_0.redis.cluster.EGM;
import design.tutorials_5_0_1.CacheClusterServiceImpl;
import design.tutorials_5_0_2.factory.JDKProxyFactory;
import design.tutorials_5_0_2.workshop.impl.EGMCacheAdapter;
import design.tutorials_5_0_2.workshop.impl.IIRCacheAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CacheService() throws InstantiationException, IllegalAccessException {
        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01","小菜");
        String val01 = proxy_EGM.get("user_name_01");
        logger.info("缓存服务 EGM 测试，proxy_EGM.get 测试结果：{}",val01);

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name_01","菜菜");
        String val02 = proxy_IIR.get("user_name_01");
        logger.info("缓存服务 EGM 测试，proxy_EGM.get 测试结果：{}",val02);
    }

}
