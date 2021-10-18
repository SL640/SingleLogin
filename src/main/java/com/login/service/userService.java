//package com.login.service;
//
//import javax.annotation.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.login.mapper.usermapper;
//import com.login.domain.user;
//
//public class userService {
//    @Resource
//    private usermapper userMapper;
//
//    public user LoginIn(String name, int password) {
//        return userMapper.getInfo(name,password);
//    }
//
//    public void Insert(String name,int password){
//        userMapper.saveInfo(name, password);
//    }
//
//
//}
