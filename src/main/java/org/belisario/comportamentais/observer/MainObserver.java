package org.belisario.comportamentais.observer;

public class MainObserver {

    public static void main(String[] args) {

        Store store = new Store();

        store.getNotificationService().subscribe(Event.SALE, new EmailListener("hobsbawn@gmail.com"));

        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailListener("hobsbawn@gmail.com"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailListener("hobbes@gmail.com"));

        store.getNotificationService().notify(Event.SALE);
        store.getNotificationService().notify(Event.NEW_ITEM);

    }
}
