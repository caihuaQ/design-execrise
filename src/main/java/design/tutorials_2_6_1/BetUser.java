package design.tutorials_2_6_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投注用户
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BetUser {
    private String userName; //用户姓名
    private int userWeight; //用户权重
}
