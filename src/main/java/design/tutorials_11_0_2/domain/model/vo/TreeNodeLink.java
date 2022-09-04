package design.tutorials_11_0_2.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 规则树线信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNodeLink {

    private Long nodeIdFrom;        //结点From
    private Long nodeIdTo;          //结点To
    private Integer ruleLimitType;  //限定类型：1:=;2>;3:<;4:>=;5:<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值

}
