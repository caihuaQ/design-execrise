package design.tutorials_17_0_2.cuisine.impl;

import design.tutorials_17_0_2.cook.ICook;
import design.tutorials_17_0_2.cuisine.ICuisine;

public class GuangDoneCuisine implements ICuisine {

    private ICook cook;

    private GuangDoneCuisine() {
    }

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}
