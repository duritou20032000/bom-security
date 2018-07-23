package com.mr.demo.web.controller;

import com.mr.demo.dto.Counter;
import com.mr.demo.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/counter")
public class CounterController {
    private Logger  logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CounterService counterService;

    @GetMapping
    public  Map<String,Object> getAllByUsernam(String username, int currentPage,int pageSize){

        Map<String,Object> map = new HashMap<>();

        List<Counter> counters = counterService.getAllByUsername(username,currentPage,pageSize);

        map.put("data",counters);

        return map;
    }
}
