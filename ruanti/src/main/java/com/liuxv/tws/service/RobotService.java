package com.liuxv.tws.service;

import com.liuxv.tws.po.Robot;

import java.util.List;

/**
 * created by liuxv on 2018/6/14
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface RobotService {
    public List<Robot> getAllRobot();

    public void update(Robot robot);
}
