package design.tutorials_23_0_2;

import java.math.BigDecimal;

/**
 * 优惠券折扣计算接口
 * @param <T>
 */
public interface ICouponDiscount<T> {

    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}
