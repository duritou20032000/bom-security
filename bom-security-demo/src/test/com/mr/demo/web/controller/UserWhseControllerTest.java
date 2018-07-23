package com.mr.demo.web.controller;

import com.mr.demo.dto.UserWhse;
import com.mr.demo.mapper.UserWhseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserWhseControllerTest {

    @Autowired
    private UserWhseMapper userWhseMapper;


    @Test
    public void selectAllByUsername(){
        List<UserWhse>  userWhses = userWhseMapper.selectAllByUsername("admin");

        for (UserWhse userWhs : userWhses) {
            System.out.println(userWhs.getWhseName());
        }

    }

}
