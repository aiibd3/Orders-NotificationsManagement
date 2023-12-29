package com.example.ordersnotifications.service.Observer;

import java.util.ArrayList;

public class MessageHandler {
    private final ArrayList<MessageObserver> messageObserverList = new ArrayList<>();

    public void subscribe(MessageObserver messageObserver) {
        this.messageObserverList.add(messageObserver);
    }

    public void handleMessageData(MessageData massageData) {
        this.messageObserverList.forEach(messageDataObserver -> messageDataObserver.sendMassage(massageData));

    }

    public void unsubscribe(MessageObserver messageObserver) {
        this.messageObserverList.remove(messageObserver);

    }
}