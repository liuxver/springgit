package com.liuxv.twoshou.service.a;

import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.po.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String name);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    List<User> selectAllUsers();

    User selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}