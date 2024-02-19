package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "员工DO")
public class EmployeeDTO implements Serializable {

    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("用户名称")
    private String username;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("身份证号码")
    private String idNumber;

}
