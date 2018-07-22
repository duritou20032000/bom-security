package com.mr.demo.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.mr.demo.dto.User;
import com.mr.demo.dto.UserQueryCondition;
import com.mr.demo.exception.UserNotExistException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.method.P;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping
//    public User createUser(@Valid @RequestBody User user, BindingResult errors){
    public User createUser(@Valid @RequestBody User user){

//        if(errors.hasErrors()){
//            errors.getAllErrors().stream().forEach(error-> System.out.println(error.getDefaultMessage()));
//        }
        throw new UserNotExistException(1);
//        System.out.println(user.getName());
//        System.out.println(user.getPassword());
//        System.out.println(user.getBirthday());
//        user.setId(1);
//        return user;
    }
    @PutMapping("/{id:\\d+}")
    public User updateUser(@Valid @RequestBody User user, BindingResult errors){

//        if(errors.hasErrors()){
//            errors.getAllErrors().stream().forEach(error->{
//                FieldError fieldError = (FieldError) error;
//                String msg = fieldError.getField()+" "+ error.getDefaultMessage();
//                System.out.println(msg);
//            });
//        }
        if(errors.hasErrors()){
            errors.getAllErrors().stream().forEach(error-> System.out.println(error.getDefaultMessage()));
        }
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());
        return user;
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteUser(User user){
        System.out.println(user.getName());
    }

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    @ApiOperation(value = "查询用户")
    public List<User> getUser(UserQueryCondition condition, @PageableDefault(page = 0,size = 10,sort="id,desc") Pageable pageable) {
//    public List<User> getUser(UserQueryCondition condition) {
//        throw new UserNotExistException(1);

        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("leohorry");
        users.add(user);
        return users;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getUserInfo(@ApiParam("用户ID")  @PathVariable String id ){
        System.out.println("进入getUserInfo()");
        User user = new User();
        user.setName ("leohorry");
        return user;
    }



}
