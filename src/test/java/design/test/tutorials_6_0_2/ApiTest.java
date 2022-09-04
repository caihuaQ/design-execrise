package design.test.tutorials_6_0_2;

import design.tutorials_6_0_1.DecorationPackageController;
import design.tutorials_6_0_2.Builder;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_Builder(){

        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
