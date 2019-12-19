package com.nf.njh.entity;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
@Data
public class PhoneDetails {
    private Integer phoneId;
    @NotEmpty(message = "cpu不能为空")
    private String cpu;
    @NotEmpty(message = "手机类型不能为空")
    private String phoneType;
    @NotEmpty(message = "像素不能为空")
    private String pixel;
    @NotEmpty(message = "cpu不能为空")
    private String batter;
    @NotEmpty(message = "cpu不能为空")
    private String screensize;
    @NotEmpty(message = "cpu不能为空")
    private String resolvingpwer;
    @NotEmpty(message = "cpu不能为空")
    private String runningmemory;
    @NotEmpty(message = "cpu不能为空")

    private Date listdate;
    @NotEmpty(message = "cpu不能为空")
    private Integer rom;
    @NotEmpty(message = "cpu不能为空")
    private String phoneName;



}
