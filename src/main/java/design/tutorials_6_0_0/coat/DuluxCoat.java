package design.tutorials_6_0_0.coat;

import design.tutorials_6_0_0.Matter;

import java.math.BigDecimal;

/**
 * 多乐士
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士(Dulux)";
    }

    @Override
    public String model() {
        return "第二次";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }
}
