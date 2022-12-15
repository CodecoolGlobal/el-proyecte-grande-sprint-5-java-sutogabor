package com.codecool.MentorMe.repository;

import com.codecool.MentorMe.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
}
