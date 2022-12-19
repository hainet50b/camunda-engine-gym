package com.programacho.camundaenginegym;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class HelloCamundaService implements JavaDelegate {

    @Override
    public void execute(final DelegateExecution execution) throws Exception {
        System.out.println("Hello Camunda!");
    }
}
