package com.weasel.springboot.infrastructure.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

import java.lang.invoke.MethodHandles;

/**
 * @author dylan
 * @date 2019/3/1
 */
public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {

        logger.info("application failed event happen......");
    }
}
