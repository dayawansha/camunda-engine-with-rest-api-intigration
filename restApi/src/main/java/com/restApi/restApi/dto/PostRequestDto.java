package com.restApi.restApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostRequestDto {
    private int id;
    private String name;
    private String file;
}
