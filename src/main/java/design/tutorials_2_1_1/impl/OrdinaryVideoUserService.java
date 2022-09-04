package design.tutorials_2_1_1.impl;

import design.tutorials_2_1_1.IVideoUserService;

/**
 * 普通用户
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户,视频720p视频");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
