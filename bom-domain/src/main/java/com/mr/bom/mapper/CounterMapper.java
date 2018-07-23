package com.mr.bom.mapper;

import com.mr.bom.domain.Counter;

import java.util.List;

public interface CounterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Counter record);

    int insertSelective(Counter record);

    List<Counter> selectAll();

    Counter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}