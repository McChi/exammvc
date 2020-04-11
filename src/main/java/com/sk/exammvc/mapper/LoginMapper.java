package com.sk.exammvc.mapper;

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
    @Select("select adminId,adminName,role from admin where adminId = #{username} and pwd = #{password}")
    Admin adminLogin(Integer username, String password);

    /**
    * 教师登录
    *
    * @param username 教师账号
     * @param password 教师密码
    * @return com.sk.exammvc.entity.Teacher
    **/
    @Select("select teacherId,teacherName,institute,sex,tel,email,cardId," +
            "type,role from teacher where teacherId = #{username} and pwd = #{password}")
    Teacher teacherLogin(Integer username, String password);

    /**
    * 学生登录
    *
    * @param username 学生学号
     * @param password 学生密码
    * @return com.sk.exammvc.entity.Student
    **/
    @Select("select studentId,studentName,grade,major,clazz,institute,tel," +
            "cardId,sex,role from student where studentId = #{username} and pwd = #{password}")
    Student studentLogin(Integer username, String password);
}
