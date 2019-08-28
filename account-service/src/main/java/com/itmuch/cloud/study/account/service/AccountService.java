package com.itmuch.cloud.study.account.service;

import com.itmuch.cloud.study.account.bean.qo.AccountQO;
import com.itmuch.cloud.study.account.dao.AccountDao;
import com.itmuch.cloud.study.account.entity.Account;
import com.itmuch.cloud.study.account.entity.AccountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> queryForList(AccountQO qo){
        AccountExample example = new AccountExample();
        example.setOrderByClause("id desc");
        AccountExample.Criteria c = example.createCriteria();
        if(qo.getUserId() != null){
            c.andUserIdEqualTo(qo.getUserId());
        }
        return accountDao.listByExample(example);
    }

    public int updateByExampleSelective(AccountQO qo) {
         Account account = new Account();
         if(qo.getUserId() != null){
             account.setUserId(qo.getUserId());
         }
         if(qo.getTotalAmount() != null){
             account.setAccountBalance(qo.getTotalAmount());
         }
         AccountExample example = new AccountExample();
         example.setOrderByClause("id desc");
         AccountExample.Criteria c = example.createCriteria();
         if(qo.getUserId() != null){
             c.andUserIdEqualTo(qo.getUserId());
         }
        return accountDao.updateByExampleSelective(account,example);
    }


}
