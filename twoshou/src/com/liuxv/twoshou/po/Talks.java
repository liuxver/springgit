package com.liuxv.twoshou.po;

import java.util.Date;

public class Talks {
    private Integer id;

    private String talkerName;

    private Date createDate;

    private String words;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalkerName() {
        return talkerName;
    }

    public void setTalkerName(String talkerName) {
        this.talkerName = talkerName == null ? null : talkerName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
    }
}