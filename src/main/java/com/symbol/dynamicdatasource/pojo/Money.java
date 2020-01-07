package com.symbol.dynamicdatasource.pojo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter@Getter
public class Money {

    private Long id;

    //基本工资
    private BigDecimal basic;

    //奖金
    private BigDecimal reward;

    //惩罚金
    private BigDecimal punishment;
}
