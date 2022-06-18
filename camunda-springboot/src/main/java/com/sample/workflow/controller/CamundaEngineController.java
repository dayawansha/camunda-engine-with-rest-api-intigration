package com.sample.workflow.controller;

import com.sample.workflow.dto.CamundaEngDto;
import com.sample.workflow.dto.PostRequestDto;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/camundaEngine")
public class CamundaEngineController{


    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/start")
    public void processStartMethode(@RequestBody CamundaEngDto camundaEngDto){
        runtimeService.startProcessInstanceByKey(camundaEngDto.getId(),camundaEngDto.getObjectHashMap());
    }

}

