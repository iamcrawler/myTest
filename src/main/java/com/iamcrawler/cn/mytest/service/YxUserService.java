package com.iamcrawler.cn.mytest.service;

import com.iamcrawler.cn.mytest.entity.YxUser;
import com.iamcrawler.cn.mytest.mapper.YxUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


//
//@Component
//@Repository
//@Controller
@Service
public class YxUserService {

    @Autowired
    YxUserMapper yxUserMapper;

    public List<YxUser> getUsers(){

        List<YxUser> userInfo = yxUserMapper.getUserInfo();

        return userInfo;
    }


}
