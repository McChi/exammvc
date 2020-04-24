package com.sk.exammvc.controller;

import com.sk.exammvc.entity.*;
import com.sk.exammvc.service.FillQuestionService;
import com.sk.exammvc.service.JudgeQuestionService;
import com.sk.exammvc.service.MultiQuestionService;
import com.sk.exammvc.service.PaperService;
import com.sk.exammvc.util.ApiResultHandler;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "/paper")
public class PaperController {

    @Autowired
    private PaperService paperService;



    @GetMapping("/papers")
    public ApiResult<PaperManage> findAll() {
       ApiResult res =  ApiResultHandler.buildApiResult(200,"请求成功",paperService.findAll());
       return  res;
    }

    @GetMapping("/paper/{paperId}")
    public Map<Integer, List<?>> findById(@PathVariable("paperId") Integer paperId) {
      return paperService.findByPaperId(paperId);
    }

    @PostMapping("/paperManage")
    public ApiResult add(@RequestBody PaperManage paperManage) {
        int res = paperService.add(paperManage);
        if (res != 0) {
            return ApiResultHandler.buildApiResult(200,"添加成功",res);
        }
        return ApiResultHandler.buildApiResult(400,"添加失败",res);
    }
}
