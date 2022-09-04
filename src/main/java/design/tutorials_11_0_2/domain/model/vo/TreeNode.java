package design.tutorials_11_0_2.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 规则树结点信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    private Long treeId;    //规则树ID
    private Long treeNodeId;    //规则树结点ID
    private Integer nodeType;   //结点类型：1子叶、2果实
    private String nodeValue;   //结点值[nodeType = 2];果实值
    private String ruleKey;     //规则key
    private String ruleDesc;    //规则描述
    private List<TreeNodeLink> treeNodeLinkList;    //结点链路

}
