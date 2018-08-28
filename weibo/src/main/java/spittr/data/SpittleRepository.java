package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * created by liuxv on 2018/7/21
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);
}
