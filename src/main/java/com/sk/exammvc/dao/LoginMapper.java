package com.sk.exammvc.dao;

import com.sk.exammvc.entity.Admin;
import com.sk.exammvc.entity.Student;
import com.sk.exammvc.entity.Teacher;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository

public interface LoginMapper {

    /**
    * 管理员登录
    *
    * @param username 管理员账号
     * @param password 管理员密码
    * @return com.sk.exammvc.entity.Admin
    **/
    Admin adminLogin(Integer username, String password);

    /**
    * 教师登录
    *
    * @param username 教师账号
     * @param password 教师密码
    * @return com.sk.exammvc.entity.Teacher
    **/
    Teacher teacherLogin(Integer username, String password);

    /**
    * 学生登录
    *
    * @param username 学生学号
     * @param password 学生密码
    * @return com.sk.exammvc.entity.Student
    **/
    Student studentLogin(Integer username, String password);
}
