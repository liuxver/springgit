package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.RobotMapper;
import com.liuxv.tws.po.Robot;
import com.liuxv.tws.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/6/14
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class RobotServiceImpl implements RobotService{

    @Autowired
    private RobotMapper robotMapper;

    @Override
    public List<Robot> getAllRobot() {
        List<Robot> list=robotMapper.getAllRobot();
        return list;
    }

    @Override
    public void update(Robot robot) {
        robotMapper.updateByPrimaryKey( robot );
    }
}
