package com.liuxv.tws.mapper;

import com.liuxv.tws.po.Btool;
import com.liuxv.tws.po.BtoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtoolMapper {
    int countByExample(BtoolExample example);

    int deleteByExample(BtoolExample example);

    int deleteByPrimaryKey(String id);

    int insert(Btool record);

    int insertSelective(Btool record);

    List<Btool> selectByExample(BtoolExample example);


    List<Btool> getAllBtool();


    List<Btool> getBtoolByName(String name);



    Btool selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Btool record, @Param("example") BtoolExample example);

    int updateByExample(@Param("record") Btool record, @Param("example") BtoolExample example);

    int updateByPrimaryKeySelective(Btool record);

    int updateByPrimaryKey(Btool record);
}