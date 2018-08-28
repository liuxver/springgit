package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.AtoolorderMapper;
import com.liuxv.tws.po.Atoolorder;
import com.liuxv.tws.service.AtoolorderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created by liuxv on 2018/6/15
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class AtoolorderServiceImpl implements AtoolorderService {
    @Autowired
    private AtoolorderMapper atoolorderMapper;

    @Override
    public void insert(Atoolorder atoolorder) {
        atoolorderMapper.insert( atoolorder );
    }
}
