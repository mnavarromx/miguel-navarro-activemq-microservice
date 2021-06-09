package com.unosquare.activemqexercise.jms;

import com.unosquare.activemqexercise.dto.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "queue1")
    public void messageListener(Message systemMessage) {
        LOGGER.info("Message received! {}", systemMessage);
    }
}
