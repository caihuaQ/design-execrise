package design.tutorials_21_0_2;

import design.tutorials_21_0_2.event.EventManager;
import design.tutorials_21_0_2.event.listener.MQEventListener;
import design.tutorials_21_0_2.event.listener.MessageEventListener;

public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService(){
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message,new MessageEventListener());
    }

    public LotteryResult draw(String uId){
        LotteryResult lotteryResult = doDraw(uId);
        eventManager.notify(EventManager.EventType.MQ,lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);
}
