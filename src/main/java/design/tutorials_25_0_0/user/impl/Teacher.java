package design.tutorials_25_0_0.user.impl;

import design.tutorials_25_0_0.user.User;
import design.tutorials_25_0_0.visitor.Visitor;

import java.math.BigDecimal;

// 老师
public class Teacher extends User {

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 升本率
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
