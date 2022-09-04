package design.tutorials_2_5_1.impl;

import design.tutorials_2_5_0.ISkill;
import design.tutorials_2_5_1.ISkillArchery;
import design.tutorials_2_5_1.ISkillInvisible;
import design.tutorials_2_5_1.ISkillSilent;

public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {
    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之失");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }
}
