package design.tutorials_17_0_2.cuisine.impl;

import design.tutorials_17_0_2.cook.ICook;
import design.tutorials_17_0_2.cuisine.ICuisine;

public class ShangDongCuisine implements ICuisine {

    private ICook cook;

    public ShangDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
