package com.symbol.dynamicdatasource.pojo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter@Getter
public class User {

    private Long id;

    //姓名
    private String name;

    //年龄
    private Integer age;

    //账户余额
    private BigDecimal money;
}
