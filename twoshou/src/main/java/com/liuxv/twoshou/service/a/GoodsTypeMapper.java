package com.liuxv.twoshou.service.a;

import com.liuxv.twoshou.po.GoodsType;
import com.liuxv.twoshou.po.GoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTypeMapper {
    int countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    GoodsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}