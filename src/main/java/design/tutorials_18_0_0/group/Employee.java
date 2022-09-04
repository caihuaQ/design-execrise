package design.tutorials_18_0_0.group;

import lombok.Data;

@Data
public class Employee {

    //ID
    private String uId;
    //姓名
    private String name;
    //备注
    private String desc;

    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }
}
