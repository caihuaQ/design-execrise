package design.tutorials_17_0_2.cuisine.impl;

import design.tutorials_17_0_2.cook.ICook;
import design.tutorials_17_0_2.cuisine.ICuisine;

public class JiangSuCuisine implements ICuisine {

    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
