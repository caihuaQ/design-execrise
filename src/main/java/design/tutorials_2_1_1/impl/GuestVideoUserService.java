package design.tutorials_2_1_1.impl;

import design.tutorials_2_1_1.IVideoUserService;

public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频480p视频");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
