package com.freefly.questionnaire.controller;

import com.freefly.questionnaire.dto.SurveyQuestionnaire;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectName:
 * ClassName:
 * Class Description:
 *
 * @Author hjwu
 * @Date2020/11/4 10:51
 */
@RestController
@RequestMapping("/answer")
@Api(tags = "问卷回答")
public class AnswerController {

    @GetMapping(value = "/{answerId}")
    public SurveyQuestionnaire queryQuestionnaire(@PathVariable String answerId) {
        return new SurveyQuestionnaire();
    }
}
