package com.sk.exammvc.dao;

import com.sk.exammvc.entity.PaperManage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PaperMapper {

    /**
    * 查询所有试卷信息
    *
    * @return java.util.List<com.sk.exammvc.entity.PaperManage>
    **/
    List<PaperManage> findAll();

    /**
    * 根据试卷号查询试卷信息
    *
    * @param paperId 试卷号
    * @return java.util.List<com.sk.exammvc.entity.PaperManage>
    **/
    List<PaperManage> findById(Integer paperId);

    /**
    * 添加试卷
    *
    * @param paperManage 试卷信息
    * @return int
    **/
    int add(PaperManage paperManage);
}
