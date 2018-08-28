package com.liuxv.fenbushi.po;

public class Account {
    private String account;

    private String user;

    private Integer money;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}