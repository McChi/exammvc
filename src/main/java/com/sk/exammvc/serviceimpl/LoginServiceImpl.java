package com.sk.exammvc.serviceimpl;

import com.sk.exammvc.entity.Admin;
import com.sk.exammvc.entity.Student;
import com.sk.exammvc.entity.Teacher;
import com.sk.exammvc.mapper.LoginMapper;
import com.sk.exammvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username,password);
    }

    @Override
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username,password);
    }

    @Override
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username,password);
    }
}
