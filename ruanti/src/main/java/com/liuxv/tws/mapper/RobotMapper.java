package com.liuxv.tws.mapper;

import com.liuxv.tws.po.Robot;
import com.liuxv.tws.po.RobotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotMapper {
    int countByExample(RobotExample example);

    int deleteByExample(RobotExample example);

    int deleteByPrimaryKey(String name);

    int insert(Robot record);

    int insertSelective(Robot record);

    List<Robot> selectByExample(RobotExample example);

    List<Robot> getAllRobot();

    Robot selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Robot record, @Param("example") RobotExample example);

    int updateByExample(@Param("record") Robot record, @Param("example") RobotExample example);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}