package com.weasel.springboot.infrastructure.analyzers;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author dylan
 * @date 2019/2/28
 */
public class TestFailureAnalyser extends AbstractFailureAnalyzer<ArithmeticException> {


    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, ArithmeticException cause) {

        return new FailureAnalysis(
                "test exception happen","test failure analyser success",cause
        );
    }
}
