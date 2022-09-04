package design.tutorials_11_0_2.domain.service.engine;

import design.tutorials_11_0_2.domain.model.aggregates.TreeRich;
import design.tutorials_11_0_2.domain.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
