package design.tutorials_2_1_0;

/**
 * 视频用户服务
 */
public class VideoUserService {

    public void serveGrade(String userType){
        if("VIP用户".equals(userType)){
            System.out.println("VIP用户,视频1080p蓝光");
        }else if("普通用户".equals(userType)){
            System.out.println("普通用户,视频720p视频");
        }else if("访客用户".equals(userType)){
            System.out.println("访客用户，视频480p视频");
        }
    }
}
