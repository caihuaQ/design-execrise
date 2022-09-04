package design.test.tutorials_2_1_1;

import design.tutorials_2_1_1.IVideoUserService;
import design.tutorials_2_1_1.impl.GuestVideoUserService;

public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
        //其他两个自己补充
    }
}
