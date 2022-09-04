package design.tutorials_6_0_0.ceiling;

import design.tutorials_6_0_0.Matter;

import java.math.BigDecimal;

public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造纸只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
