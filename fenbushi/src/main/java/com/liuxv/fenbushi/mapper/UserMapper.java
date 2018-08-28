package com.liuxv.fenbushi.mapper;

import com.liuxv.fenbushi.po.User;
import com.liuxv.fenbushi.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String name);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);


    List<User> getAllUser();





    User selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}