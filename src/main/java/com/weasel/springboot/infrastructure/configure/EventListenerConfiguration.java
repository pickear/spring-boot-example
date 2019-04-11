package com.weasel.springboot.infrastructure.configure;

import com.weasel.springboot.infrastructure.listeners.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dylan
 * @date 2019/3/1
 */
@Configuration
public class EventListenerConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public ApplicationStartedListener applicationStartedListener(){
        return new ApplicationStartedListener();
    }

    @Bean
    @ConditionalOnMissingBean
    public ApplicationReadyListener applicationReadyListener(){
        return new ApplicationReadyListener();
    }

    @Bean
    @ConditionalOnMissingBean
    public ApplicationFailedListener applicationFailedListener(){
        return new ApplicationFailedListener();
    }

    /*@Bean
    @ConditionalOnMissingBean
    public ContextStartedListener contextStartedListener(){
        return new ContextStartedListener();
    }*/
}
