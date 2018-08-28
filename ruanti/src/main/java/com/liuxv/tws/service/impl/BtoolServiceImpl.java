package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.BtoolMapper;
import com.liuxv.tws.po.Btool;
import com.liuxv.tws.service.BtoolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class BtoolServiceImpl implements BtoolService {

    @Autowired
    private BtoolMapper btoolMapper;


    @Override
    public List<Btool> getAllBtool() {

        List<Btool> list=btoolMapper.getAllBtool();
        return list;
    }

    @Override
    public List<Btool> getBtoolByName(String name) {
        List<Btool> list=btoolMapper.getBtoolByName( name );
        return list;
    }
}
