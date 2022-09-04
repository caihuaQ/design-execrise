package design.tutorials_11_0_2.domain.service.logic;


import design.tutorials_11_0_2.domain.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {

    /**
     * 逻辑决策器
     * @param matterValue 决策值
     * @param treeNodeLinkInfoList 决策结点
     * @return 下一个结点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkInfoList);

    /**
     * 获取决策值
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}


