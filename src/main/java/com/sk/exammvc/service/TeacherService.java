package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Teacher;
import com.sk.exammvc.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public IPage<Teacher> findAll(Page<Teacher> page) {
        return teacherMapper.findAll(page);
    }

    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }

    public Teacher findById(Integer teacherId) {
        return teacherMapper.findById(teacherId);
    }

    public int deleteById(Integer teacherId) {
        return teacherMapper.deleteById(teacherId);
    }

    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    public int add(Teacher teacher) {
        return teacherMapper.add(teacher);
    }
}
