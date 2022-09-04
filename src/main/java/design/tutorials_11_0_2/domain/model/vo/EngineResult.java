package design.tutorials_11_0_2.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 决策结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineResult {

    private boolean isSuccess; //执行结果
    private String userId;      //用户ID
    private Long treeId;        //规则树ID
    private Long nodeId;        //果实结点ID
    private String nodeValue;   //果实结点值
}
