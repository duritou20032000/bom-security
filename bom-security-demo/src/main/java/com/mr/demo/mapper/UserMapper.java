package com.mr.demo.mapper;

import com.mr.demo.dto.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from bm_user")
    List<User> getAll();

}
