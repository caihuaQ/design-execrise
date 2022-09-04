package design.tutorials_11_0_2.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.dc.pr.PRError;

/**
 * 树根信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRoot {

    private Long treeId;        //规则树ID
    private Long treeRootNodeId;//规则树根ID
    private String treeName;    //规则树名称

}
