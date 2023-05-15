package com.itranswarp.exchange.service;

import com.itranswarp.exchange.message.event.AbstractEvent;
import com.itranswarp.exchange.messaging.MessageProducer;
import com.itranswarp.exchange.messaging.Messaging;
import com.itranswarp.exchange.messaging.MessagingFactory;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendEventService {

    @Autowired
    private MessagingFactory messagingFactory;

    private MessageProducer<AbstractEvent> messageProducer;

    @PostConstruct
    public void init() {
        this.messageProducer = messagingFactory.createMessageProducer(Messaging.Topic.SEQUENCE, AbstractEvent.class);
    }

    public void sendMessage(AbstractEvent message) {
        this.messageProducer.sendMessage(message);
    }
}
