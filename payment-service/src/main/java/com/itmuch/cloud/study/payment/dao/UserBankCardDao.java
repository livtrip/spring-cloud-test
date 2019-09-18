package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.UserBankCard;
import com.itmuch.cloud.study.payment.entity.UserBankCardExample;
import java.util.List;

public interface UserBankCardDao {
    int insert(UserBankCard record);

    int save(UserBankCard record);

    int deleteByExample(UserBankCardExample example);

    int deleteById(Long id);

    int updateById(UserBankCard record);

    int updateByPrimaryKey(UserBankCard record);

    int updateByExampleSelective(UserBankCard record, UserBankCardExample example);

    int updateByExample(UserBankCard record, UserBankCardExample example);

    UserBankCard getById(Long id);

    List<UserBankCard> listByExample(UserBankCardExample example);

    int countByExample(UserBankCardExample example);

    Page<UserBankCard> listForPage(int pageCurrent, int pageSize, UserBankCardExample example);
}