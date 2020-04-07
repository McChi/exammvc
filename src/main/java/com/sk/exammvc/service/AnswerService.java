package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.vo.AnswerVO;

public interface AnswerService {

    IPage<AnswerVO> findAll(Page<AnswerVO> page);
}
