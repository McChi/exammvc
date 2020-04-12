package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.MultiQuestion;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import java.util.List;

//选择题
@Repository
public interface MultiQuestionMapper {

    /**
    * 从题库中查询选择题到指定试卷中
    *
    * @param PaperId 试卷号
    * @return java.util.List<com.sk.exammvc.entity.MultiQuestion>
    **/
    List<MultiQuestion> findByIdAndType(Integer PaperId);

    /**
    * 查询所有选择题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.MultiQuestion>
    **/
    IPage<MultiQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     *
     * @return MultiQuestion
     */
    MultiQuestion findOnlyQuestionId();

    /**
    * 添加选择题
    *
    * @param multiQuestion 选择题信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "questionId")
    int add(MultiQuestion multiQuestion);

    /**
    * 根据科目和题号查询选择题
    *
    * @param subject 科目
     * @param pageNo 题号
    * @return java.util.List<java.lang.Integer>
    **/
    List<Integer> findBySubject(String subject, Integer pageNo);


}
