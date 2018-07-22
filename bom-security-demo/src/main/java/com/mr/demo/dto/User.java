package com.mr.demo.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.mr.demo.valid.MyConstraint;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonValue;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

   public interface UserSimpleView{};
   public interface UserDetailView extends UserSimpleView{};

    private Integer id;
    @MyConstraint(message = "这个是测试自定义校验逻辑")
    private String name;
    @NotBlank(message = "密码不能为空")
    private String password;
    @Past(message = "生日必须是过去的时间")
    private Date birthday;

    public User() {
    }
    @JsonView(UserSimpleView.class)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @JsonView(UserSimpleView.class)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @JsonView(UserSimpleView.class)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
