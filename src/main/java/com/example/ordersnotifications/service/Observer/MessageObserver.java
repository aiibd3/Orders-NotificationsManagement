package com.example.ordersnotifications.service.Observer;

import org.springframework.stereotype.Service;

@Service
public interface MessageObserver {
    public void sendMassage(MessageData massageData);

}
