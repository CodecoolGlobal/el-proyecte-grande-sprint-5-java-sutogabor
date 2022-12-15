package com.codecool.MentorMe.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Task {
    @SequenceGenerator(
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_sequence"
    )
    @JsonIgnore
    @Id
    private Long id;

    private String name;

    private String message;

    private boolean isCompleted;

    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "taskOptions", cascade = CascadeType.ALL)
    private List<Answer> options;
}