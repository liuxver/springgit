package com.liuxv.tws.mapper;

import com.liuxv.tws.po.Atoolorder;
import com.liuxv.tws.po.AtoolorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtoolorderMapper {
    int countByExample(AtoolorderExample example);

    int deleteByExample(AtoolorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Atoolorder record);

    int insertSelective(Atoolorder record);

    List<Atoolorder> selectByExample(AtoolorderExample example);

    Atoolorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Atoolorder record, @Param("example") AtoolorderExample example);

    int updateByExample(@Param("record") Atoolorder record, @Param("example") AtoolorderExample example);

    int updateByPrimaryKeySelective(Atoolorder record);

    int updateByPrimaryKey(Atoolorder record);
}