package com.sk.exammvc.service;

import com.sk.exammvc.entity.PaperManage;
import com.sk.exammvc.dao.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public List<PaperManage> findAll() {
        return paperMapper.findAll();
    }

    public List<PaperManage> findById(Integer paperId) {
        return paperMapper.findById(paperId);
    }

    public int add(PaperManage paperManage) {
        return paperMapper.add(paperManage);
    }

}
