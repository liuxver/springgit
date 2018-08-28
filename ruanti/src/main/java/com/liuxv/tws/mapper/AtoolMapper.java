package com.liuxv.tws.mapper;

import com.liuxv.tws.po.Atool;
import com.liuxv.tws.po.AtoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtoolMapper {
    int countByExample(AtoolExample example);

    int deleteByExample(AtoolExample example);

    int deleteByPrimaryKey(String name);

    int insert(Atool record);

    int insertSelective(Atool record);

    List<Atool> selectByExample(AtoolExample example);

    List<Atool> getAllAtool();



    Atool selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Atool record, @Param("example") AtoolExample example);

    int updateByExample(@Param("record") Atool record, @Param("example") AtoolExample example);

    int updateByPrimaryKeySelective(Atool record);

    int updateByPrimaryKey(Atool record);
}