package design.tutorials_4_0_0.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 优惠券返回结果类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponResult {

    private String code;//编码
    private String info;//描述
}
