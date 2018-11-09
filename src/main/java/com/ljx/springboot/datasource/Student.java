package com.ljx.springboot.datasource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Student {
    private Integer id ;
    private String name ;
    private String note ;
    private SexEnum sex ;
}
