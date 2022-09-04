package design.test.tutorials_6_0_1;

import design.tutorials_5_0_0.application.CacheService;
import design.tutorials_5_0_2.factory.JDKProxyFactory;
import design.tutorials_5_0_2.workshop.impl.EGMCacheAdapter;
import design.tutorials_5_0_2.workshop.impl.IIRCacheAdapter;
import design.tutorials_6_0_1.DecorationPackageController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}
