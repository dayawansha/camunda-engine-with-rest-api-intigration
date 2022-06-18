package com.sample.workflow.dto;

import lombok.Data;

import java.util.HashMap;

@Data
public class CamundaEngDto {
    private String id;
    private String name;
//    private Object dataObject;
    private HashMap<String,Object> objectHashMap;
}
