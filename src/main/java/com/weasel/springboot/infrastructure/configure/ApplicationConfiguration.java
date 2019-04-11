package com.weasel.springboot.infrastructure.configure;

import com.weasel.springboot.infrastructure.analyzers.ArithmeticExceptionMaker;
import com.weasel.springboot.infrastructure.analyzers.TestLoggingFailureAnalysisReporter;
import com.weasel.springboot.infrastructure.analyzers.TestFailureAnalyser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dylan
 * @date 2019/2/27
 */
@Configuration
@EnableConfigurationProperties(ApplicationProperties.class)
public class ApplicationConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TestLoggingFailureAnalysisReporter failureAnalysisReporter(){
        return new TestLoggingFailureAnalysisReporter();
    }

    @Bean
    @ConditionalOnMissingBean
    public TestFailureAnalyser testFailureAnalyser(){
        return new TestFailureAnalyser();
    }

    @Bean
    @ConditionalOnProperty(value = "springboot.example.test-analyser",matchIfMissing = false)
    @ConditionalOnBean({TestFailureAnalyser.class})
    public ArithmeticExceptionMaker throwException(){
        return new ArithmeticExceptionMaker();
    }
}
