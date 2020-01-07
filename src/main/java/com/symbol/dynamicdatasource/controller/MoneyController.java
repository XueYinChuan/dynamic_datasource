package com.symbol.dynamicdatasource.controller;

import com.symbol.dynamicdatasource.pojo.Money;
import com.symbol.dynamicdatasource.service.MoneyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/money")
@Api(description = "工资管理")
public class MoneyController {

    @Autowired
    private MoneyService moneyService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @ApiOperation(value = "查询指定ID用户工资")
    public Money testQuery() {
        return moneyService.selectMoneyById(1);
    }

}
