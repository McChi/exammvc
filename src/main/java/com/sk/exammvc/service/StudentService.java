package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Student;
import com.sk.exammvc.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public IPage<Student> findAll(Page<Student> page) {
        return studentMapper.findAll(page);
    }

    public Student findById(Integer studentId) {
        return studentMapper.findById(studentId);
    }

    public int deleteById(Integer studentId) {
        return studentMapper.deleteById(studentId);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public int updatePwd(Student student) {
        return studentMapper.updatePwd(student);
    }

    public int add(Student student) {
        return studentMapper.add(student);
    }
}
