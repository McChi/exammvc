package com.sk.exammvc.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.vo.AnswerVO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerMapper {

    /**
    * 查找所有的题库中的题
    *
    * @param page 分页对象
    * @return com.baomidou.mybatisplus.core.metadata.IPage<com.sk.exammvc.vo.AnswerVO>
    **/
    @Select("select question, subject, score, \"选择题\" as type from multi_question " +
            "union select question, subject, score, \"判断题\" as type  from judge_question " +
            "union select question, subject, score, \"填空题\" as type from fill_question")
    IPage<AnswerVO> findAll(Page page);
}
