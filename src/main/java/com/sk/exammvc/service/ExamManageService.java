package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.ExamManage;
import com.sk.exammvc.dao.ExamManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamManageService {
    @Autowired
    private ExamManageMapper examManageMapper;

    public List<ExamManage> findAll() {
        return examManageMapper.findAll();
    }

    public IPage<ExamManage> findAll(Page<ExamManage> page) {
        return examManageMapper.findAll(page);
    }

    public ExamManage findById(Integer examCode) {
        return examManageMapper.findById(examCode);
    }

    public int delete(Integer examCode) {
        return examManageMapper.delete(examCode);
    }

    public int update(ExamManage exammanage) {
        return examManageMapper.update(exammanage);
    }

    public int add(ExamManage exammanage) {
        return examManageMapper.add(exammanage);
    }

    public ExamManage findOnlyPaperId() {
        return examManageMapper.findOnlyPaperId();
    }
}
