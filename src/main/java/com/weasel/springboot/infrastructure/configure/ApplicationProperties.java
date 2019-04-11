package com.weasel.springboot.infrastructure.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dylan
 * @date 2019/2/28
 */
@ConfigurationProperties("springboot.example")
public class ApplicationProperties {

    private boolean testAnalyser = false;

    public boolean isTestAnalyser() {
        return testAnalyser;
    }

    public void setTestAnalyser(boolean testAnalyser) {
        this.testAnalyser = testAnalyser;
    }
}
