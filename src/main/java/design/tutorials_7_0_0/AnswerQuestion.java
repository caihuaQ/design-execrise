package design.tutorials_7_0_0;

import lombok.Data;

/**
 * 解答题
 */
@Data
public class AnswerQuestion {

    private String name; //问题
    private String key;  //答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
