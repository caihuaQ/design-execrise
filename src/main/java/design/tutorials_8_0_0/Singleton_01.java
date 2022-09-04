package design.tutorials_8_0_0;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {

    }

    public static Singleton_01 getInstance(){
        if (null != instance){
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
