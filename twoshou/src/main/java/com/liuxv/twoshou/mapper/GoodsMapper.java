package com.liuxv.twoshou.mapper;

import com.liuxv.twoshou.po.Goods;
import com.liuxv.twoshou.po.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(String name);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    List<Goods> AllGoods();

    Goods selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}