package design.tutorials_9_0_2;

import lombok.Data;

/**
 *  统一的MQ消息体
 */
@Data
public class RebateInfo {

    private String userId;  //用户ID
    private String bizId;   //业务ID
    private String bizTime; //业务时间
    private String desc;    //业务描述
}
