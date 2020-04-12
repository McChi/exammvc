package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.ExamManage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamManageMapper {

    /**
    * 查找所有试卷
    *
    * @return java.util.List<com.sk.exammvc.entity.ExamManage>
    **/
    @Select("select * from exam_manage")
    List<ExamManage> findAll();

    /**
    * 按照分页的方式查找所有试卷
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.ExamManage>
    **/
    @Select("select * from exam_manage")
    IPage<ExamManage> findAll(Page page);

    /**
    * 按照试卷号查找试卷
    *
    * @param examCode 试卷号
    * @return com.sk.exammvc.entity.ExamManage
    **/
    @Select("select * from exam_manage where examCode = #{examCode}")
    ExamManage findById(Integer examCode);

    /**
    * 删除试卷
    *
    * @param examCode 试卷号
    * @return int
    **/
    @Delete("delete from exam_manage where examCode = #{examCode}")
    int delete(Integer examCode);

    /**
    * 更新试卷信息
    *
    * @param exammanage 试卷信息
    * @return int
    **/
    @Update("update exam_manage set description = #{description},source = #{source},paperId = #{paperId}," +
            "examDate = #{examDate},totalTime = #{totalTime},grade = #{grade}," +
            "major = #{major},institute = #{institute},totalScore = #{totalScore}," +
            "type = #{type},tips = #{tips} where examCode = #{examCode}")
    int update(ExamManage exammanage);

    /**
    * 增加试卷
    *
    * @param exammanage 试卷信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "examCode")
    @Insert("insert into exam_manage(description,source,paperId,examDate,totalTime,grade,major,institute,totalScore,type,tips)" +
            " values(#{description},#{source},#{paperId},#{examDate},#{totalTime},#{grade},#{major},#{institute},#{totalScore},#{type},#{tips})")
    int add(ExamManage exammanage);

    /**
     * 查询最后一条记录的paperId,返回给前端达到自增效果
     *
     * @return paperId
     **/
    @Select("select paperId from exam_manage order by paperId desc limit 1")
    ExamManage findOnlyPaperId();
}
