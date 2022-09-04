package design.tutorials_19_0_2.dao;

import design.tutorials_19_0_2.po.User;

public interface IUserDao {

    User queryUserInfoById(Long id);

}
