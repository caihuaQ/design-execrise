package design.tutorials_25_0_0.user.impl;


import design.tutorials_25_0_0.user.User;
import design.tutorials_25_0_0.visitor.Visitor;

import java.util.Random;

// 学生
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }

    public int count() {
        return 105 - new Random().nextInt(10);
    }

}
