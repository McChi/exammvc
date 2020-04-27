package com.sk.exammvc.entity;

import lombok.Data;

@Data
public class Score {
    private Integer examCode;

    private Integer studentId;

    private String subject;

    private Integer etScore;

    private Integer scoreId;

    private String answerDate;
}