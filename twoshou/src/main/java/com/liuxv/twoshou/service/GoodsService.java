package com.liuxv.twoshou.service;

import com.liuxv.twoshou.po.Goods;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface GoodsService {
    public List<Goods> findGoodsList();

    public List<Goods> findGoodsListByType(int n);

    public void deleteGoods(String name);

    public void insertGoods(Goods goods);

    public Goods findGoodsByName(String name);



}
