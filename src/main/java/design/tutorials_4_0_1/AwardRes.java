package design.tutorials_4_0_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发奖结果反馈对象
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AwardRes {

    private String code; //编码
    private String info; //描述

}
