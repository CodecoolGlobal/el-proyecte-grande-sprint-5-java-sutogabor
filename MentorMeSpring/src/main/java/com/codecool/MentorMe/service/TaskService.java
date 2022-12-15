package com.codecool.MentorMe.service;

import com.codecool.MentorMe.model.Task;
import com.codecool.MentorMe.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository tr) {
        this.taskRepository = tr;
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public Task getTaskById(Long id) {
        return taskRepository.getById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


}
