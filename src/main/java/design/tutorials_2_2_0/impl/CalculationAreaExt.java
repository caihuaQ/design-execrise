package design.tutorials_2_2_0.impl;

/**
 * 开闭原则
 * 扩展继承，实现自己的需求
 */
public class CalculationAreaExt extends CalculationArea{

    private final static double π = 3.141592653D;

    @Override
    public double circular(double r) {
        return π*r*r;
    }
}
