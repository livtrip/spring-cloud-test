package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page.Page;
import com.itmuch.cloud.study.common.util.Page.PageUtil;
import com.itmuch.cloud.study.payment.dao.UserBankCardDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.UserBankCardMapper;
import com.itmuch.cloud.study.payment.entity.UserBankCard;
import com.itmuch.cloud.study.payment.entity.UserBankCardExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserBankCardDaoImpl implements UserBankCardDao {
    @Autowired
    private UserBankCardMapper userBankCardMapper;

    public int insert(UserBankCard record) {
        return this.userBankCardMapper.insert(record);
    }

    public int save(UserBankCard record) {
        return this.userBankCardMapper.insertSelective(record);
    }

    public int deleteByExample(UserBankCardExample example) {
        return this.userBankCardMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.userBankCardMapper.deleteByPrimaryKey(id);
    }

    public int updateById(UserBankCard record) {
        return this.userBankCardMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserBankCard record) {
        return this.userBankCardMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(UserBankCard record, UserBankCardExample example) {
        return this.userBankCardMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserBankCard record, UserBankCardExample example) {
        return this.userBankCardMapper.updateByExample(record, example);
    }

    public List<UserBankCard> listByExample(UserBankCardExample example) {
        return this.userBankCardMapper.selectByExample(example);
    }

    public UserBankCard getById(Long id) {
        return this.userBankCardMapper.selectByPrimaryKey(id);
    }

    public int countByExample(UserBankCardExample example) {
        return this.userBankCardMapper.countByExample(example);
    }

    public Page<UserBankCard> listForPage(int pageCurrent, int pageSize, UserBankCardExample example) {
        int count = this.userBankCardMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<UserBankCard>(count, totalPage, pageCurrent, pageSize, this.userBankCardMapper.selectByExample(example));
    }
}