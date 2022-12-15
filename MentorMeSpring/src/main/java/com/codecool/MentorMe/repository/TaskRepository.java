package com.codecool.MentorMe.repository;

import com.codecool.MentorMe.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
