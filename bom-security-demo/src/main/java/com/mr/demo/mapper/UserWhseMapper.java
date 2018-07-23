package com.mr.demo.mapper;

import com.mr.demo.dto.UserWhse;

import java.util.List;

public interface UserWhseMapper {
    int deleteByPrimaryKey(String userWhseId);

    int insert(UserWhse record);

    int insertSelective(UserWhse record);

    List<UserWhse> selectAllByUsername(String username);

    UserWhse selectByPrimaryKey(String userWhseId);

    int updateByPrimaryKeySelective(UserWhse record);

    int updateByPrimaryKey(UserWhse record);
}