package org.belisario.comportamentais.observer;

import java.util.*;

public class NotificationService {

    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values())
                .forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, EventListener eventListener) {
        customers.get(event).add(eventListener);
    }

    public void unsubscribe(Event event, EventListener eventListener) {
        customers.get(event).remove(eventListener);
    }

    public void notify(Event event) {
        customers.get(event).forEach(eventListener -> eventListener.update(event));
    }
}
