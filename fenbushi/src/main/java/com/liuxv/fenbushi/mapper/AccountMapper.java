package com.liuxv.fenbushi.mapper;

import com.liuxv.fenbushi.po.Account;
import com.liuxv.fenbushi.po.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(String account);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    List<Account> getAllAccount();

    List<Account> getAccountByName(String name);



    Account selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}