package design.tutorials_17_0_2.cook.impl;

import design.tutorials_17_0_2.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShangDongCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    public void doCooking() {
        logger.info("山东厨师，烹饪鲁菜，宫廷菜系，以孔府风味为龙头");
    }

}
