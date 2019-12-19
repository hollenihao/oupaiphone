package com.nf.njh.entity;


import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserInfo {
    //userInfo按字段排：编号，用户名，密码，账号类型，状态
    private Integer uId;
    @NotNull(message = "账号错误") //不能为空
    private String uName;
    @Size(min = 6,max = 18,message = "密码长度为6-18位")
    private String uPassword;
    private Integer uStatus;

}
