package com.sk.exammvc.entity;

import lombok.Data;

//判断题实体类
@Data
public class JudgeQuestion {
    private Integer questionId;

    private String subject;

    private String question;

    private String answer;

    private Integer score;

}