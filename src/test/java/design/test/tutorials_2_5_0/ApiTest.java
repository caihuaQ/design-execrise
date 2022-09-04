package design.test.tutorials_2_5_0;

import com.alibaba.fastjson.JSON;
import design.tutorials_2_4_1.Principal;
import design.tutorials_2_5_0.HeroHouYi;
import design.tutorials_2_5_0.HeroLianPo;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ApiTest {

    @Test
    public void test_ISkill(){
        // 后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        // 廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }

}
