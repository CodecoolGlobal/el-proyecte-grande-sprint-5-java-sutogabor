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
@Table(name = "solutions")
public class Solution {
    @SequenceGenerator(
            name = "solution_sequence",
            sequenceName = "solution_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "solution_sequence"
    )
    @JsonIgnore
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
    private boolean isCorrect;
}
