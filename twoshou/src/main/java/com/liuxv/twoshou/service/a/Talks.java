package com.liuxv.twoshou.service.a;

public class Talks {
    private Integer id;

    private String talkerName;

    private String date;

    private String words;


    public Talks(int id,String  talkerName,String date,String words){
        this.id=id;
        this.talkerName=talkerName;
        this.date=date;
        this.words=words;
    }


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
    }
}