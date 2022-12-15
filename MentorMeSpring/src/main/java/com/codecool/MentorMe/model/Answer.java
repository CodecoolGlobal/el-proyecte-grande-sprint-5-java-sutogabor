package com.codecool.MentorMe.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "answers")
public class Answer {
    @SequenceGenerator(
            name = "answer_sequence",
            sequenceName = "answer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "answer_sequence"
    )
    @JsonIgnore
    @Id
    private Long id;
    private String message;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    private Task taskOptions;
}
