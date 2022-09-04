package design.tutorials_19_0_2.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;

}
