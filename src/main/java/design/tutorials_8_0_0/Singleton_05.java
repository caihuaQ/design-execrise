package design.tutorials_8_0_0;

public class Singleton_05 {

    private static volatile Singleton_05 instance;

    private Singleton_05() {

    }

    public static synchronized Singleton_05 getInstance(){
        if(null != instance){
            return instance;
        }
        synchronized (Singleton_05.class){
            if(null == instance){
                instance =new Singleton_05();
            }
        }
        return instance;
    }
}
