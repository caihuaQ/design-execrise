package design.tutorials_16_0_2.impl;

import design.tutorials_16_0_0.AuthService;
import design.tutorials_16_0_2.AuthInfo;
import design.tutorials_16_0_2.AuthLink;

import java.text.ParseException;
import java.util.Date;

public class Level3AuthLink extends AuthLink {

    public Level3AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if(null == date){
            return new AuthInfo("0001","单号",orderId,"状态：待三级审批负责人",levelUserName);
        }
        AuthLink next = super.getNext();
        if(null == next){
            return new AuthInfo("0000","单号",orderId,"状态：一级审批完成负责人","时间：",f.format(date)," 审批人：", levelUserName);
        }
        return next.doAuth(uId,orderId,authDate);
    }
}
