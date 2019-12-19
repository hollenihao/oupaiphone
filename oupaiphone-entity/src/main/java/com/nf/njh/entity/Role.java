package com.nf.njh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role {
    private Integer id;
    private String name;
    private String description;
public Role(){}
}
