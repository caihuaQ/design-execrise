package design.tutorials_14_0_2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);
        if(null == activity){
            //模拟从实际业务应用从接口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书减免");
            activity.setDesc("图书减免活动二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }

}
