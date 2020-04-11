package com.sk.exammvc.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.JudgeQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
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
    @Select("select * from judge_question where questionId in (select questionId from paper_manage where questionType = 3 and paperId = #{paperId})")
    List<JudgeQuestion> findByIdAndType(Integer paperId);

    /**
    * 查询所有判断题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.JudgeQuestion>
    **/
    @Select("select * from judge_question")
    IPage<JudgeQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     *
     * @return JudgeQuestion
     */
    @Select("select questionId from judge_question order by questionId desc limit 1")
    JudgeQuestion findOnlyQuestionId();

    /**
    * 添加判断题
    *
    * @param judgeQuestion 判断题信息
    * @return int
    **/
    @Insert("insert into judge_question(subject,question,answer,analysis,level,section) values " +
            "(#{subject},#{question},#{answer},#{analysis},#{level},#{section})")
    int add(JudgeQuestion judgeQuestion);

    /**
    * 根据科目和页码查询判断题
    *
    * @param subject 科目
     * @param pageNo 页码
    * @return java.util.List<java.lang.Integer>
    **/
    @Select("select questionId from judge_question  where subject=#{subject}  order by rand() desc limit #{pageNo}")
    List<Integer> findBySubject(String subject, Integer pageNo);
}
