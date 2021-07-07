package com.example.workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.service.CamundaService;


@RestController
@RequestMapping("/api")
public class HelloController {
	
	@Autowired
	private CamundaService camundaService;
	
	@GetMapping("/process-instance/{processKey}")
    public void getCamunda(@PathVariable String processKey) {
        camundaService.triggerProcess(processKey);
	}
}
