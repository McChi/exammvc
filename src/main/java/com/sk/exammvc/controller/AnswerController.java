package com.sk.exammvc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.ApiResult;
import com.sk.exammvc.service.AnswerService;
import com.sk.exammvc.util.ApiResultHandler;
import com.sk.exammvc.vo.AnswerVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/answers/{page}/{size}")
    public ApiResult findAllQuestion(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
       Page<AnswerVO> answerVOPage = new Page<>(page,size);
       IPage<AnswerVO> answerVOIPage = answerService.findAll(answerVOPage);
       return ApiResultHandler.buildApiResult(200,"查询所有题库",answerVOIPage);

    }
}
