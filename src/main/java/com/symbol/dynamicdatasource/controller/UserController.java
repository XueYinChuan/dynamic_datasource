package com.symbol.dynamicdatasource.controller;

import com.symbol.dynamicdatasource.pojo.User;
import com.symbol.dynamicdatasource.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(description = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @ApiOperation(value = "查询指定ID用户信息")
    public User testQuery() {
        return userService.selectUserByName("Daisy");
    }

}
