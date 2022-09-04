package design.tutorials_6_0_0.floor;

import design.tutorials_6_0_0.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(Der)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }
}
