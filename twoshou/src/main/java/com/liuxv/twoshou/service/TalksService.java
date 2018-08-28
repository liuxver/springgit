package com.liuxv.twoshou.service;

import com.liuxv.twoshou.po.Talks;

import java.util.List;

/**
 * created by liuxv on 2018/5/28
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface TalksService {
    public List<Talks> getAllTalks();

    public void deleteTalks(int id);

    public void insert(Talks talks);
}
