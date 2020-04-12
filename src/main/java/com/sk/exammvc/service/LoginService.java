package com.sk.exammvc.service;

import com.sk.exammvc.entity.Admin;
import com.sk.exammvc.entity.Student;
import com.sk.exammvc.entity.Teacher;
import com.sk.exammvc.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    /**
    * 管理员登录
    *
    * @param username 管理员账号
     * @param password 管理员密码
    * @return com.sk.exammvc.entity.Admin
    **/
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username,password);
    }

    /**
    * 教师登录
    *
    * @param username 教师账号
     * @param password 教师密码
    * @return com.sk.exammvc.entity.Teacher
    **/
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username,password);
    }

    /**
    * 学生登录
    *
    * @param username 学生学号
     * @param password 学生密码
    * @return com.sk.exammvc.entity.Student
    **/
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username,password);
    }
}
