package com.mr.demo.service;

import com.github.pagehelper.PageHelper;
import com.mr.demo.dto.Counter;
import com.mr.demo.dto.PageBean;
import com.mr.demo.dto.UserWhse;
import com.mr.demo.mapper.CounterMapper;
import com.mr.demo.mapper.UserWhseMapper;
import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CounterService {

    @Autowired
    private UserWhseMapper userWhseMapper;
    @Autowired
    private CounterMapper counterMapper;

    public List<Counter> getAllByUsername(String username, int currentPage,int pageSize){

        PageHelper.startPage(currentPage, pageSize);
        List<Counter> counters = new ArrayList<>();
        List<UserWhse>  recordes = userWhseMapper.selectAllByUsername(username);
        for (UserWhse recorde : recordes) {
            String  whseCode = recorde.getWhseCode();
            if(StringUtil.isNotBlank(whseCode)){
                List<Counter> cs = counterMapper.selectAllByWhseCode(whseCode);
                counters.addAll(cs);
            }
        }

        int countNums = counters.size();//总记录数
        PageBean<Counter> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(counters);
        return pageData.getItems();
    }


}
