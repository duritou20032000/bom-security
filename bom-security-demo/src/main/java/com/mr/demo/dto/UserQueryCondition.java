package com.mr.demo.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserQueryCondition implements Serializable {
    private String USER_NAME;
    private String realname;
    private String WHSE_ID;
    @ApiModelProperty(value = "用户手机号查询")
    private String mobile;
    private String email;
    private Integer status;

    public UserQueryCondition() {
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getWHSE_ID() {
        return WHSE_ID;
    }

    public void setWHSE_ID(String WHSE_ID) {
        this.WHSE_ID = WHSE_ID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
