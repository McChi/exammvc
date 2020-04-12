package com.sk.exammvc.dao;

import com.sk.exammvc.entity.PaperManage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PaperMapper {

    /**
    * 查询所有试卷信息
    *
    * @return java.util.List<com.sk.exammvc.entity.PaperManage>
    **/
    @Select("select paperId, questionType,questionId from paper_manage")
    List<PaperManage> findAll();

    /**
    * 根据试卷号查询试卷信息
    *
    * @param paperId 试卷号
    * @return java.util.List<com.sk.exammvc.entity.PaperManage>
    **/
    @Select("select paperId, questionType,questionId from paper_manage where paperId = #{paperId}")
    List<PaperManage> findById(Integer paperId);

    /**
    * 添加试卷
    *
    * @param paperManage 试卷信息
    * @return int
    **/
    @Insert("insert into paper_manage(paperId,questionType,questionId) values " +
            "(#{paperId},#{questionType},#{questionId})")
    int add(PaperManage paperManage);
}
