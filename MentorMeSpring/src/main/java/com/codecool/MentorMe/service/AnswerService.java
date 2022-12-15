package com.codecool.MentorMe.service;

import com.codecool.MentorMe.model.Answer;
import com.codecool.MentorMe.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Answer getAnswerById(Long id) { return answerRepository.getById(id); }
    public void addAnswer(Answer task) {
        answerRepository.save(task);
    }
}
