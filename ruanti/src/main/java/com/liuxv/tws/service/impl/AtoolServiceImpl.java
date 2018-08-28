package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.AtoolMapper;
import com.liuxv.tws.po.Atool;
import com.liuxv.tws.service.AtoolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class AtoolServiceImpl implements AtoolService {

    @Autowired
    private AtoolMapper atoolMapper;

    @Override
    public List<Atool> getAllAtool() {
        List<Atool> list=atoolMapper.getAllAtool();
        return list;
    }


}
