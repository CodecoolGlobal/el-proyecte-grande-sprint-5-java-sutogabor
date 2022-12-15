package com.codecool.MentorMe.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AnswerController {

    private final AnswerService answerService;
    private final SolutionService solutionService;

    @Autowired
    public AnswerController(AnswerService as, SolutionService solutionService) {
        this.answerService = as;
        this.solutionService = solutionService;
    }

    @GetMapping("/{id}")
    public boolean checkAnswer(@PathVariable("id") Long id) {
        return solutionService.checkAnswer(id);
    }

}
