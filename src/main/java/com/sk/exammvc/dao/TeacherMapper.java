package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TeacherMapper {

    /**
     * 按照分页的方式查找教师
     *
     * @param page 分页对象
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.Teacher>
     **/
    IPage<Teacher> findAll(Page page);

    /**
     * 查找教师
     *
     * @return java.util.List<com.sk.exammvc.entity.Teacher>
     **/
    @Select("select * from teacher")
    List<Teacher> findAll();

    /**
     * 按照教师账号寻找教师
     *
     * @param teacherId 教师账号
     * @return com.sk.exammvc.entity.Teacher
     **/
    Teacher findById(Integer teacherId);

    /**
     * 删除教师
     *
     * @param teacherId 教师账号
     * @return int
     **/
    int deleteById(Integer teacherId);

    /**
     * 更新教师信息
     *
     * @param teacher 教师信息
     * @return int
     **/
    int update(Teacher teacher);

    /**
     * 添加教师
     *
     * @param teacher 教师信息
     * @return int
     * @author baishucong
     * @date 17:50 2020/4/11
     **/
    @Options(useGeneratedKeys = true, keyProperty = "teacherId")
    int add(Teacher teacher);
}
