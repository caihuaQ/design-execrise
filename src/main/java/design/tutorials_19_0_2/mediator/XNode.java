package design.tutorials_19_0_2.mediator;

import lombok.Data;

import java.util.Map;

@Data
public class XNode {

    private String namespace;
    private String id;
    private String parameterType;
    private String resultType;
    private String sql;
    private Map<Integer, String> parameter;

}
