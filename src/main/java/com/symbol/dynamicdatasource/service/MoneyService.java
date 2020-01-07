package com.symbol.dynamicdatasource.service;

import com.symbol.dynamicdatasource.mapper.db2.MoneyMapper;
import com.symbol.dynamicdatasource.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyService {

    @Autowired
    private MoneyMapper moneyMapper;

    /**
     * 根据名字查找用户
     */
    public Money selectMoneyById(int id) {
        return moneyMapper.findMoneyById(id);
    }
}
