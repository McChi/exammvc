package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.MultiQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
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
    @Select("select * from multi_question where questionId in (select questionId from paper_manage where questionType = 1 and paperId = #{paperId})")
    List<MultiQuestion> findByIdAndType(Integer PaperId);

    /**
    * 查询所有选择题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.MultiQuestion>
    **/
    @Select("select * from multi_question")
    IPage<MultiQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     *
     * @return MultiQuestion
     */
    @Select("select questionId from multi_question order by questionId desc limit 1")
    MultiQuestion findOnlyQuestionId();

    /**
    * 添加选择题
    *
    * @param multiQuestion 选择题信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "questionId")
    @Insert("insert into multi_question(subject,question,answerA,answerB,answerC,answerD,rightAnswer,analysis,section,level) " +
            "values(#{subject},#{question},#{answerA},#{answerB},#{answerC},#{answerD},#{rightAnswer},#{analysis},#{section},#{level})")
    int add(MultiQuestion multiQuestion);

    /**
    * 根据科目和页码查询选择题
    *
    * @param subject 科目
     * @param pageNo 页码
    * @return java.util.List<java.lang.Integer>
    **/
    @Select("select questionId from multi_question  where subject =#{subject} order by rand() desc limit #{pageNo}")
    List<Integer> findBySubject(String subject, Integer pageNo);


}
