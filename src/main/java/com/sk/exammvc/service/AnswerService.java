package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.dao.AnswerMapper;
import com.sk.exammvc.vo.AnswerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    /**
    * 查询所有题库
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.vo.AnswerVO>
    **/
    public IPage<AnswerVO> findAll(Page<AnswerVO> page) {
        return answerMapper.findAll(page);
    }
}
