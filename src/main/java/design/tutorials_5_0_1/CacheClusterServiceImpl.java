package design.tutorials_5_0_1;

import design.tutorials_5_0_0.redis.RedisUtils;
import design.tutorials_5_0_0.redis.cluster.EGM;
import design.tutorials_5_0_0.redis.cluster.IIR;
import sun.dc.pr.PRError;

import java.util.concurrent.TimeUnit;

/**
 * 升级后，使用多套Redis集群服务，同步兼容以前单体Redis服务
 */
public class CacheClusterServiceImpl implements CacheService{

    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {

        if(1 == redisType){
            return egm.gain(key);
        }

        if(2 == redisType){
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {

        if(1==redisType){
            egm.set(key,value);
            return;
        }

        if(2==redisType){
            iir.set(key, value);
            return;
        }

    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {

        if(1 == redisType){
            egm.setEX(key, value, timeout, timeUnit);
            return;
        }

        if(2==redisType){
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if(1 == redisType){
            egm.delete(key);
            return;
        }

        if(2==redisType){
            iir.del(key);
            return;
        }

        redisUtils.del(key);
    }
}
