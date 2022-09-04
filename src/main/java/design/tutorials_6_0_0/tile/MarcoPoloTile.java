package design.tutorials_6_0_0.tile;

import design.tutorials_6_0_0.Matter;

import java.math.BigDecimal;

public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马克波罗(MARCO POLO)";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉";
    }
}
