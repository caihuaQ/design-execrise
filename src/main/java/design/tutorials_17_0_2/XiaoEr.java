package design.tutorials_17_0_2;

import design.tutorials_17_0_2.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class XiaoEr {

    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine){
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder(){
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}
