package com.iamcrawler.cn.mytest.controller;


import com.iamcrawler.cn.mytest.entity.YxUser;
import com.iamcrawler.cn.mytest.service.YxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//这叫注解
@RequestMapping("/test")
public class TestController {

    @Autowired//从spring ioc 容器里面拿实例对象
    private YxUserService yxUserService;

    //请求方式有很多种，如get/post/delete/put...
    //这里用的是get,也是浏览器默认的请求方式
    @GetMapping("/get/name")
    public String getName(){
        return "liuliang";
    }

    @GetMapping("/get/users/by/db")
    public List<YxUser> getUsers(){

        return this.yxUserService.getUsers();
    }

}
