package com.weasel.springboot.infrastructure.arguments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.util.List;

/**
 * @author dylan
 * @date 2019/3/1
 */
@Component
public class ApplicationArgumentsHolder {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    public ApplicationArgumentsHolder(ApplicationArguments arguments){

        boolean debug = arguments.containsOption("debug");
        List<String> nonOptionArgs = arguments.getNonOptionArgs();

        logger.info("debug is {},nonOptionArgs is {}......",debug,nonOptionArgs);
    }
}
