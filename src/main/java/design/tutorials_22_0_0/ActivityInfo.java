package design.tutorials_22_0_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInfo {

    private String activityId;  //活动ID
    private String activityName;    //活动名称
    private Enum<Status> status;    //  活动状态
    private Date beginTime;     //开始时间
    private Date endTime;       //结束时间

}
