package design.tutorials_21_0_2.event;

import design.tutorials_21_0_2.LotteryResult;
import design.tutorials_21_0_2.event.listener.EventListener;
import org.attoparser.trace.MarkupTraceEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Event Manager
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... operations){
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public enum EventType {
        MQ, Message
    }

    /**
     * 订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void subscribe(Enum<EventType> eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     *  取消订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(Enum<EventType> eventType, LotteryResult result){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
