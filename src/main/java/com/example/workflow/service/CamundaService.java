package com.example.workflow.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.stereotype.Service;


@Service
public class CamundaService {
	
	public void triggerProcess(String processKey)  {
        
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);
        ProcessInstanceWithVariables response = instance.executeWithVariablesInReturn();
    }
}
