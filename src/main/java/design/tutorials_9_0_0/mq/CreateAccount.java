package design.tutorials_9_0_0.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * 开户
 */
@Data
public class CreateAccount {

    private String number;      //开户编码
    private String address;     //开户地
    private Date accountDate;   //开户时间
    private String desc;        //开户描述

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
