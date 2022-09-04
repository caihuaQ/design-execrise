package design.tutorials_2_4_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 教师
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private String name;                // 老师名称
    private String clazz;               // 班级
    private static List<Student> studentList;  // 学生

    //总分
    public double clazzTotalScore(){
        double totalScore = 0;
        for (Student student : Teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    //平均分
    public double clazzAverageScore(){
        double totalScore = 0;
        for (Student student : Teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore / Teacher.getStudentList().size();
    }

    //班级人数
    public int clazzStudentCount(){
        return Teacher.getStudentList().size();
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }
}
