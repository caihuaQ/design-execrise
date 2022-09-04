package design.tutorials_8_0_0;

public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {

    }

    public static synchronized Singleton_03 getInstance(){
        return instance;
    }
}
