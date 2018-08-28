package com.liuxv.tws.po;

public class Atoolorder {
    private Integer id;

    private String atoolname;

    private String userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtoolname() {
        return atoolname;
    }

    public void setAtoolname(String atoolname) {
        this.atoolname = atoolname == null ? null : atoolname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}