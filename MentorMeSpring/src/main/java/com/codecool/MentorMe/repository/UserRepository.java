package com.codecool.MentorMe.repository;

import com.codecool.MentorMe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
