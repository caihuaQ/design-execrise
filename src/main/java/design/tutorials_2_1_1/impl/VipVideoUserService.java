package design.tutorials_2_1_1.impl;

import design.tutorials_2_1_1.IVideoUserService;

/**
 * vip用户
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户,视频1080p蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户，视频无广告");
    }
}
