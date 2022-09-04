package design.test.tutorials_2_5_1;

import design.tutorials_2_5_1.impl.HeroHouYi;
import design.tutorials_2_5_1.impl.HeroLianPo;
import org.junit.Test;

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
