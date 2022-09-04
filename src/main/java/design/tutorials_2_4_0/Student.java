package design.tutorials_2_4_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;    // 学生姓名
    private int rank;       // 考试排名(总排名)
    private double grade;   // 考试分数(总分)

}
