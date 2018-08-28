package com.liuxv.twoshou.service.impl;

import com.liuxv.twoshou.mapper.TalksMapper;
import com.liuxv.twoshou.po.Talks;
import com.liuxv.twoshou.po.TalksExample;
import com.liuxv.twoshou.service.TalksService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/5/28
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class TalksServicesImpl implements TalksService {
    @Autowired
    private TalksMapper talksMapper;


    @Override
    public List<Talks> getAllTalks() {
        //TalksExample talksExample=new TalksExample();
        List<Talks> talksList=talksMapper.getAllTalks();

        return talksList;
    }

    @Override
    public void deleteTalks(int id) {
        talksMapper.deleteByPrimaryKey( id );
    }

    @Override
    public void insert(Talks talks) {
        talksMapper.insert( talks );
    }
}
