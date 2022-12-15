package com.codecool.MentorMe.api;

import com.codecool.MentorMe.model.Task;
import com.codecool.MentorMe.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class TaskController {
    private TaskService taskService;
    @Autowired
    public TaskController(TaskService ts) {
        this.taskService = ts;
    }

    @PostMapping
    public void addTask(@RequestBody Task newTask) {
        taskService.addTask(newTask);
    }

}
