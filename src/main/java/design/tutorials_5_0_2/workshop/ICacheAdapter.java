package design.tutorials_5_0_2.workshop;

import java.util.concurrent.TimeUnit;

/**
 * 车间适配器
 */
public interface ICacheAdapter {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
