package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Score;
import com.sk.exammvc.dao.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    public int add(Score score) {
        return scoreMapper.add(score);
    }

    public List<Score> findAll() {
        return scoreMapper.findAll();
    }

    public IPage<Score> findById(Page page, Integer studentId) {
        return scoreMapper.findByIdPage(page, studentId);
    }

    public List<Score> findById(Integer studentId) {
        return scoreMapper.findById(studentId);
    }

    public List<Score> findByExamCode(Integer examCode) {
        return scoreMapper.findByExamCode(examCode);
    }
}
