package com.sk.exammvc.service;

import com.sk.exammvc.entity.Admin;
import com.sk.exammvc.entity.Student;
import com.sk.exammvc.entity.Teacher;

public interface LoginService {

    public Admin adminLogin(Integer username, String password);

    public Teacher teacherLogin(Integer username, String password);

    public Student studentLogin(Integer username, String password);
}
