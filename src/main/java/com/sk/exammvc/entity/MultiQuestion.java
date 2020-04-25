package com.sk.exammvc.entity;

import lombok.Data;

// 选择题实体
@Data
public class MultiQuestion {
    private Integer questionId;

    private String subject;

    private String answerA;

    private String answerB;

    private String answerC;

    private String answerD;

    private String question;

    private String rightAnswer;

    private Integer score;

}