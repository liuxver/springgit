package com.liuxv.fenbushi.service.impl;

import com.liuxv.fenbushi.mapper.AccountMapper;
import com.liuxv.fenbushi.po.Account;
import com.liuxv.fenbushi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/6/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<Account> getAllAccount() {
        List<Account> list=accountMapper.getAllAccount();

        return list;
    }

    @Override
    public Account getAccountByAccount(String account) {
        return accountMapper.selectByPrimaryKey( account );
    }

    @Override
    public List<Account> getAccountByName(String name) {
        List<Account> list=accountMapper.getAccountByName( name );
        return list;
    }

    @Override
    public void insert(Account account) {
        accountMapper.insert( account );
    }

    @Override
    public void update(Account account) {
        accountMapper.updateByPrimaryKey( account );
    }
}
