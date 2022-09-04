package design.tutorials_15_0_0;

import design.tutorials_15_0_0.agent.Select;

public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
