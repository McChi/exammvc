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
    List<ExamManage> findAll();

    /**
    * 按照分页的方式查找所有试卷
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.entity.ExamManage>
    **/
    IPage<ExamManage> findAllByPage(Page page);

    /**
    * 按照试卷号查找试卷
    *
    * @param examCode 试卷号
    * @return com.sk.exammvc.entity.ExamManage
    **/
    ExamManage findById(Integer examCode);

    /**
    * 删除试卷
    *
    * @param examCode 试卷号
    * @return int
    **/
    int delete(Integer examCode);

    /**
    * 更新试卷信息
    *
    * @param exammanage 试卷信息
    * @return int
    **/
    int update(ExamManage exammanage);

    /**
    * 增加试卷
    *
    * @param exammanage 试卷信息
    * @return int
    **/
    @Options(useGeneratedKeys = true,keyProperty = "examCode")
    int add(ExamManage exammanage);

    /**
     * 查询最后一条记录的paperId,返回给前端达到自增效果
     *
     * @return paperId
     **/
    ExamManage findOnlyPaperId();
}
