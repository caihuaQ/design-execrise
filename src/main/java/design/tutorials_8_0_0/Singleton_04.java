package design.tutorials_8_0_0;

public class Singleton_04 {

    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {

    }

    public static synchronized Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }
}
