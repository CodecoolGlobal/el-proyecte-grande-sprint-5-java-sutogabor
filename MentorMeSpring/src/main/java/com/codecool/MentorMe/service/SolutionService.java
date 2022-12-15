package com.codecool.MentorMe.service;

import com.codecool.MentorMe.model.Solution;
import com.codecool.MentorMe.repository.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SolutionService {
    private final SolutionRepository solutionRepository;

    @Autowired
    public SolutionService(SolutionRepository solutionRepository) {
        this.solutionRepository = solutionRepository;
    }

    public boolean checkAnswer(Long id) {
        return solutionRepository.getById(id).isCorrect();
    }

    public void addSolution(Solution solution) {
        solutionRepository.save(solution);
    }
}
