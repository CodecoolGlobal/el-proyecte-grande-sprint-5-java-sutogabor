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

    public void updateTaskById(Long id, Task updatedTask){
        updatedTask.setId(id);
        taskRepository.save(updatedTask);
    }

    public Task getRandomTask() {
        List<Task> availableTasks = getAllTasks().stream().filter(task -> !task.isCompleted()).toList();
        Random random = new Random();
        if (availableTasks.isEmpty()) {
            return null;
        } else {
            Task taskToSend = availableTasks.get(random.nextInt(availableTasks.size()));
            taskToSend.setCompleted(true);
            updateTaskById(taskToSend.getId(), taskToSend);
            return taskToSend;
        }
    }
}
