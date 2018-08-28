package com.liuxv.twoshou.service.impl;

import com.liuxv.twoshou.mapper.GoodsMapper;
import com.liuxv.twoshou.po.Goods;
import com.liuxv.twoshou.po.GoodsExample;
import com.liuxv.twoshou.po.OrdersExample;
import com.liuxv.twoshou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findGoodsListByType(int n){
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andTypeIdEqualTo( n );
        List<Goods> goods=goodsMapper.selectByExample( goodsExample );
        return goods;

    }


    @Override
    public List<Goods> findGoodsList() {
        //GoodsExample goodsExample=new GoodsExample();
        List<Goods> goods=goodsMapper.AllGoods();
        return goods;
    }





    @Override
    public void deleteGoods(String name) {
       // String s=goods.getName();
        goodsMapper.deleteByPrimaryKey( name );
    }

    @Override
    public void insertGoods(Goods goods) {
        goodsMapper.insert( goods );
    }

    @Override
    public Goods findGoodsByName(String name) {
        return goodsMapper.selectByPrimaryKey( name );
    }

}
