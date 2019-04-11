package com.weasel.springboot;

import com.weasel.springboot.infrastructure.listeners.ApplicationStartingListener;
import com.weasel.springboot.infrastructure.listeners.ContextStartedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.invoke.MethodHandles;

/**
 * @author Dylan
 * @date 2016/7/20.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationBoot implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        /*new SpringApplicationBuilder().sources(ApplicationBoot.class)
                                      .run(args);*/
        SpringApplication springApplication = new SpringApplication(ApplicationBoot.class);
        springApplication.addListeners(new ApplicationStartingListener(),new ContextStartedListener());

        springApplication.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("command line runner print......");
    }
}
