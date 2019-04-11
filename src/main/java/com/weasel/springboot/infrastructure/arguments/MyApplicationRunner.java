package com.weasel.springboot.infrastructure.arguments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

/**在SpringApplication.run(…​)方法执行完之前，调用该类的run方法。
 * @author dylan
 * @date 2019/3/1
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void run(ApplicationArguments args) throws Exception {

        boolean debug = args.containsOption("debug");
        if(debug){
            logger.info("debug mode is running......");
        }
    }
}
