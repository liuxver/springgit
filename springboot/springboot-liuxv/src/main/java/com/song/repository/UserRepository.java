package com.song.repository;

import com.song.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 444 on 2018/5/2.
 */
@Repository 

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select t from User t where t.name= :name")
    User findByUserName(@Param("name") String name);
}
