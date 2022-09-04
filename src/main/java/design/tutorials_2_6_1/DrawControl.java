package design.tutorials_2_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 抽奖控制
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count){
        return draw.prize(betUserList, count);
    }

}
