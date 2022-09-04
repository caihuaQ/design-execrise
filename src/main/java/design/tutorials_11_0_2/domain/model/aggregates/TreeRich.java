package design.tutorials_11_0_2.domain.model.aggregates;

import design.tutorials_11_0_2.domain.model.vo.TreeNode;
import design.tutorials_11_0_2.domain.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 规则树聚合
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRich {

    private TreeRoot treeRoot;      //树根信息
    private Map<Long, TreeNode> treeNodeMap;    //树结点ID -> 子结点
}
