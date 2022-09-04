package design.tutorials_16_0_2.impl;

import design.tutorials_16_0_0.AuthService;
import design.tutorials_16_0_2.AuthInfo;
import design.tutorials_16_0_2.AuthLink;

import java.text.ParseException;
import java.util.Date;

public class Level1AuthLink extends AuthLink {

    private Date beginDate = f.parse("2020-06-11 00:00:00");
    private Date endDate = f.parse("2020-06-20 23:59:59");

    public Level1AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if(null == date){
            return new AuthInfo("0001","单号",orderId,"状态：待一级审批负责人",levelUserName);
        }
        AuthLink next = super.getNext();
        if(null == next){
            return new AuthInfo("0000","单号",orderId,"状态：三级级审批负责人完成",f.format(date),levelUserName," 审批人：", levelUserName);
        }
        if(authDate.before(beginDate) || authDate.after(endDate)){
            return new AuthInfo("0000","单号",orderId,"状态：三级级审批负责人完成",f.format(date),levelUserName," 审批人：", levelUserName);
        }
        return next.doAuth(uId,orderId,authDate);
    }
}
