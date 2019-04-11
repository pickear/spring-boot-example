package com.weasel.springboot.infrastructure.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import java.lang.invoke.MethodHandles;

/**
 * @author dylan
 * @date 2019/3/1
 */
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        logger.info("application started event happen......");
    }
}
