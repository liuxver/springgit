package spittr.data;

/**
 * created by liuxv on 2018/7/23
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
import spittr.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
