package com.codecool.MentorMe.api;

import com.codecool.MentorMe.model.Task;
import com.codecool.MentorMe.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    private TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void addTask(@RequestBody Task newTask) {
        taskService.addTask(newTask);
    }

    @GetMapping("/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Long id) { return taskService.getTaskById(id); }

    @PutMapping("/{id}")
    public void updateTaskById(@PathVariable("id") Long id, @RequestBody Task updatedTask) {
        taskService.updateTaskById(id, updatedTask);
    }

    @GetMapping
    public Task getRandomTask() { return taskService.getRandomTask(); }

    @GetMapping("/uncompleted")
    public void setTasksToUncompleted() {
        taskService.setTasksToUncompleted();
    }
}
