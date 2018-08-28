package com.liuxv.fenbushi.service;

import com.liuxv.fenbushi.po.Account;

import java.util.List;

/**
 * created by liuxv on 2018/6/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface AccountService {
    public List<Account> getAllAccount();

    public Account getAccountByAccount(String account);

    public List<Account> getAccountByName(String name);

    public void insert(Account account);

    public void update(Account account);
}
