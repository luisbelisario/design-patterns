package org.belisario.comportamentais.observer;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

}
