package design.tutorials_2_5_1.impl;

import design.tutorials_2_5_1.ISkillInvisible;
import design.tutorials_2_5_1.ISkillSilent;
import design.tutorials_2_5_1.ISkillVertigo;

public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {
    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }
}
