package design.tutorials_4_0_2;

import design.tutorials_4_0_2.store.ICommodity;
import design.tutorials_4_0_2.store.impl.CardCommodityService;
import design.tutorials_4_0_2.store.impl.CouponCommodityService;
import design.tutorials_4_0_2.store.impl.GoodsCommodityService;

/**
 * 工厂
 */
public class StoreFactory {

    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return              实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType){
        if(null == commodityType) return null;
        if(1 == commodityType) return new CouponCommodityService();
        if(2 == commodityType) return new GoodsCommodityService();
        if(3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的奖品服务");
    }

    /**
     * 奖品类信息方式实例化
     * @param clazz 奖品类
     * @return      实例化对象
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws IllegalAccessException, InstantiationException{
        if(null == clazz) return null;
        return clazz.newInstance();
    }

}
