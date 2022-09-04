package design.tutorials_9_0_2.impl;

import design.tutorials_9_0_0.service.OrderService;
import design.tutorials_9_0_2.OrderAdapterService;

/**
 * 内部订单，判断首单逻辑
 */
public class InsideOrderServiceImpl implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
