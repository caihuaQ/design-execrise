package design.tutorials_9_0_2.impl;

import design.tutorials_9_0_0.service.POPOrderService;
import design.tutorials_9_0_2.OrderAdapterService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
