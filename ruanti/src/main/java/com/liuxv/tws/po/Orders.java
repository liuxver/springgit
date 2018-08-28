package com.liuxv.tws.po;

public class Orders {
    private Integer id;

    private String uid;

    private String btoolid;

    private String data;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getBtoolid() {
        return btoolid;
    }

    public void setBtoolid(String btoolid) {
        this.btoolid = btoolid == null ? null : btoolid.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}