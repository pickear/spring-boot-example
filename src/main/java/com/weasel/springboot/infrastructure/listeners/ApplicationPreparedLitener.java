package com.weasel.springboot.infrastructure.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

import java.lang.invoke.MethodHandles;

/**ApplicationPreparedEvent 在bean加载之前发生，所以不能通过bean的形式注册。
 * 可以通过SpringApplicationBuilder.listeners(…​)或者在META-INF/spring.factories添加
 * org.springframework.context.ApplicationListener=com.example.project.MyListener方式注册。
 * @author dylan
 * @date 2019/3/1
 */
public class ApplicationPreparedLitener implements ApplicationListener<ApplicationPreparedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        logger.info("application prepared event happen......");
    }
}
