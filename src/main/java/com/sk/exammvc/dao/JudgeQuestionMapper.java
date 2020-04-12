package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.JudgeQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;

//判断题
@Repository
public interface JudgeQuestionMapper {

    /**
    * 从题库中查询判断题到指定试卷中
    *
    * @param paperId 试卷号
    * @return java.util.List<com.sk.exammvc.entity.JudgeQuestion>
    **/
    List<JudgeQuestion> findByIdAndType(Integer paperId);

    /**
    * 查询所有判断题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.JudgeQuestion>
    **/
    IPage<JudgeQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     *
     * @return JudgeQuestion
     */
    JudgeQuestion findOnlyQuestionId();

    /**
    * 添加判断题
    *
    * @param judgeQuestion 判断题信息
    * @return int
    **/
    int add(JudgeQuestion judgeQuestion);

    /**
    * 根据科目和题号查询判断题
    *
    * @param subject 科目
     * @param pageNo 题号
    * @return java.util.List<java.lang.Integer>
    **/
    List<Integer> findBySubject(String subject, Integer pageNo);
}
