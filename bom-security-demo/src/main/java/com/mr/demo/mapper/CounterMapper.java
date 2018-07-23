package com.mr.demo.mapper;

import com.mr.demo.dto.Counter;

import java.util.List;

public interface CounterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Counter record);

    int insertSelective(Counter record);

    List<Counter> selectAllByWhseCode(String whseCode);

    List<Counter> selectAll();

    Counter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}