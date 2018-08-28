package com.song.entity;

import javax.persistence.*;

/**
 * Created by 444 on 2018/5/1.
 */
@Entity
@Table(name = "tbl_user") //数据库中表的名字
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
