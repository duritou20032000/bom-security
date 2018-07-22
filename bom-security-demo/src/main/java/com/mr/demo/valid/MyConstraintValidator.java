package com.mr.demo.valid;

import com.mr.demo.service.HelloService;
import com.mr.demo.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Object> {
    @Autowired
    private HelloServiceImpl helloService;

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        helloService.greeting((String) value);
        System.out.println(value);
        return false;
    }
}
