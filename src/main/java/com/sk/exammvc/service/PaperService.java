package com.sk.exammvc.service;

import com.sk.exammvc.entity.FillQuestion;
import com.sk.exammvc.entity.JudgeQuestion;
import com.sk.exammvc.entity.MultiQuestion;
import com.sk.exammvc.entity.PaperManage;
import com.sk.exammvc.dao.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Autowired
    private JudgeQuestionService judgeQuestionService;

    @Autowired
    private MultiQuestionService multiQuestionService;

    @Autowired
    private FillQuestionService fillQuestionService;

    public List<PaperManage> findAll() {
        return paperMapper.findAll();
    }

    public List<PaperManage> findById(Integer paperId) {
        return paperMapper.findById(paperId);
    }

    public int add(PaperManage paperManage) {
        return paperMapper.add(paperManage);
    }

    public Map<Integer, List<?>> findByPaperId(int paperId){
        List<MultiQuestion> multiQuestionRes = multiQuestionService.findByIdAndType(paperId);   //选择题题库 1
        List<FillQuestion> fillQuestionsRes = fillQuestionService.findByIdAndType(paperId);     //填空题题库 2
        List<JudgeQuestion> judgeQuestionRes = judgeQuestionService.findByIdAndType(paperId);   //判断题题库 3
        Map<Integer, List<?>> map = new HashMap<>();
        map.put(1,multiQuestionRes);
        map.put(2,fillQuestionsRes);
        map.put(3,judgeQuestionRes);
        return map;
    }

    public int deleteById(Integer paperId){
        return paperMapper.deleteById(paperId);
    }
}
