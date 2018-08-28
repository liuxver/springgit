package com.liuxv.twoshou.service.a;

import com.liuxv.twoshou.po.Talks;
import com.liuxv.twoshou.po.TalksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TalksMapper {
    int countByExample(TalksExample example);

    int deleteByExample(TalksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Talks record);

    int insertSelective(Talks record);

    List<Talks> selectByExample(TalksExample example);


    List<Talks> getAllTalks();



    Talks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Talks record, @Param("example") TalksExample example);

    int updateByExample(@Param("record") Talks record, @Param("example") TalksExample example);

    int updateByPrimaryKeySelective(Talks record);

    int updateByPrimaryKey(Talks record);
}