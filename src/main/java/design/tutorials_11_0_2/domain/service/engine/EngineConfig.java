package design.tutorials_11_0_2.domain.service.engine;

import design.tutorials_11_0_2.domain.service.logic.LogicFilter;
import design.tutorials_11_0_2.domain.service.logic.impl.UserAgeFilter;
import design.tutorials_11_0_2.domain.service.logic.impl.UserGenderFilter;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }

}
