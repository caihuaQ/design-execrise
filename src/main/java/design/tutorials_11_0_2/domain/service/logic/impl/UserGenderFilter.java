package design.tutorials_11_0_2.domain.service.logic.impl;

import design.tutorials_11_0_2.domain.service.logic.BaseLogic;

import java.util.Map;

public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
