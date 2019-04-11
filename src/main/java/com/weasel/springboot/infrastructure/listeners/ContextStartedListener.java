package com.weasel.springboot.infrastructure.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import java.lang.invoke.MethodHandles;

/**
 * @author dylan
 * @date 2019/3/1
 */
public class ContextStartedListener implements ApplicationListener<ContextStartedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        logger.info("context started event happen......");
    }
}
