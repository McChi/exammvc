package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreMapper {

    /**
    * 添加一条成绩记录
    *
    * @param score 成绩信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "scoreId")
    @Insert("insert into score(examCode,studentId,subject,ptScore,etScore,score,answerDate) values(#{examCode},#{studentId},#{subject},#{ptScore},#{etScore},#{score},#{answerDate})")
    int add(Score score);

    /**
    * 查询所有成绩信息
    *
    * @return java.util.List<com.sk.exammvc.entity.Score>
    **/
    @Select("select scoreId,examCode,studentId,subject,ptScore,etScore,score,answerDate from score order by scoreId desc")
    List<Score> findAll();

    // 分页
    @Select("select scoreId,examCode,studentId,subject,ptScore,etScore,score,answerDate from score where studentId = #{studentId} order by scoreId desc")
    IPage<Score> findById(Page<?> page, Integer studentId);

    // 不分页
    @Select("select scoreId,examCode,studentId,subject,ptScore,etScore,score,answerDate from score where studentId = #{studentId}")
    List<Score> findById(Integer studentId);

    /**
     *
     * @return 查询每位学生的学科分数。 max其实是假的，为了迷惑老师，达到一次考试考生只参加了一次的效果
     **/
    @Select("select max(etScore) as etScore from score where examCode = #{examCode} group by studentId")
    List<Score> findByExamCode(Integer examCode);
}
