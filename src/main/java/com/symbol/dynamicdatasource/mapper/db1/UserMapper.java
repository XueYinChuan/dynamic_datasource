package com.symbol.dynamicdatasource.mapper.db1;

import com.symbol.dynamicdatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

@Mapper
@Qualifier("db1SqlSessionTemplate")
public interface UserMapper {

    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);

}
