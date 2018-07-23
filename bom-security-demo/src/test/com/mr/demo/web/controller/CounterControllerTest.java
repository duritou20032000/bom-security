package com.mr.demo.web.controller;


import com.mr.demo.dto.Counter;
import com.mr.demo.mapper.CounterMapper;
import com.mr.demo.service.CounterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CounterControllerTest {

    @Autowired
    private CounterMapper counterMapper;

    @Autowired
    private CounterService counterService;

    @Test
    public void whenSelectSuccess(){
        List<Counter> counters = counterMapper.selectAll();
        for (Counter counter : counters) {
            System.out.println("--------->>>>>"+counter.getCounterCode());
        }

    }

    @Test
    public void whenSelectAllByUsername(){
        List<Counter> counters = counterService.getAllByUsername("yuzongying",0,2);
        for (Counter counter : counters) {
            System.out.println("---->>>>"+counter.getCounterCode());
        }
    }

}
