package com.liuxv.tws.service;

import com.liuxv.tws.po.Btool;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface BtoolService {
    public List<Btool> getAllBtool();

    public List<Btool> getBtoolByName(String name);

}
