package design.test.tutorials_17_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_16_0_0.AuthService;
import design.tutorials_16_0_2.AuthLink;
import design.tutorials_16_0_2.impl.Level1AuthLink;
import design.tutorials_16_0_2.impl.Level2AuthLink;
import design.tutorials_16_0_2.impl.Level3AuthLink;
import design.tutorials_17_0_2.XiaoEr;
import design.tutorials_17_0_2.cook.impl.GuangDongCook;
import design.tutorials_17_0_2.cook.impl.JiangSuCook;
import design.tutorials_17_0_2.cook.impl.ShangDongCook;
import design.tutorials_17_0_2.cook.impl.SiChuanCook;
import design.tutorials_17_0_2.cuisine.ICuisine;
import design.tutorials_17_0_2.cuisine.impl.GuangDoneCuisine;
import design.tutorials_17_0_2.cuisine.impl.JiangSuCuisine;
import design.tutorials_17_0_2.cuisine.impl.ShangDongCuisine;
import design.tutorials_17_0_2.cuisine.impl.SiChuanCuisine;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiTest {

    @Test
    public void test_xiaoEr(){
        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShangDongCuisine shanDongCuisine = new ShangDongCuisine(new ShangDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        xiaoEr.placeOrder();

    }

}
