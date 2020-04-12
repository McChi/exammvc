package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.FillQuestion;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import java.util.List;

//填空题
@Repository
public interface FillQuestionMapper {

    /**
    * 从题库中查询填空题到指定试卷中
    *
    * @param paperId 试卷号
    * @return java.util.List<com.sk.exammvc.entity.FillQuestion>
    **/
    List<FillQuestion> findByIdAndType(Integer paperId);

    /**
    * 查询所有填空题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.FillQuestion>
    **/
    IPage<FillQuestion> findAll(Page page);

    /**
     * 查询最后一条questionId
     *
     * @return FillQuestion
     **/
    FillQuestion findOnlyQuestionId();

    /**
    * 增加填空题
    *
    * @param fillQuestion 填空题信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty ="questionId" )
    int add(FillQuestion fillQuestion);

    /**
    * 根据科目和题号查询填空题
    *
    * @param subject 科目
     * @param pageNo 题号
    * @return java.util.List<java.lang.Integer>
    **/
    List<Integer> findBySubject(String subject, Integer pageNo);
}
