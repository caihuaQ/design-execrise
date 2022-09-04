package design.tutorials_14_0_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    /**
     * 库存总量
     */
    private int total;

    /**
     * 库存已用
     */
    private int used;

}
