package design.tutorials_11_0_2.domain.service.engine.impl;

import design.tutorials_11_0_2.domain.model.aggregates.TreeRich;
import design.tutorials_11_0_2.domain.model.vo.EngineResult;
import design.tutorials_11_0_2.domain.model.vo.TreeNode;
import design.tutorials_11_0_2.domain.service.engine.EngineBase;

import java.util.Collections;
import java.util.Map;

public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        //决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        //决策结果
        return new EngineResult( null != treeNode,userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
