package com.mr.bom.mapper;

import com.mr.bom.domain.UserWhse;

public interface UserWhseMapper {
    int deleteByPrimaryKey(String userWhseId);

    int insert(UserWhse record);

    int insertSelective(UserWhse record);

    UserWhse selectByPrimaryKey(String userWhseId);

    int updateByPrimaryKeySelective(UserWhse record);

    int updateByPrimaryKey(UserWhse record);
}