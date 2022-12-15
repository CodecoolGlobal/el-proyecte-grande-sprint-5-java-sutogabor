package com.codecool.MentorMe;

import com.codecool.MentorMe.model.Answer;
import com.codecool.MentorMe.model.Solution;
import com.codecool.MentorMe.model.Task;
import com.codecool.MentorMe.service.AnswerService;
import com.codecool.MentorMe.service.SolutionService;
import com.codecool.MentorMe.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MentorMeApplication implements CommandLineRunner {

	@Autowired
	private TaskService taskService;
	@Autowired
	private AnswerService answerService;
	@Autowired
	private SolutionService solutionService;

	public static void main(String[] args) {
		SpringApplication.run(MentorMeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Task task1 = new Task();
		task1.setId(1L);
		Answer answer1 = new Answer(1L, "Python", task1);
		Answer answer2 = new Answer(2L, "JS", task1);
		Answer answer3 = new Answer(3L, "JAVA", task1);
		Answer answer4 = new Answer(4L, "C#", task1);
		Solution solution1 = new Solution(1L, answer1, true);
		Solution solution2 = new Solution(2L, answer2, false);
		Solution solution3 = new Solution(3L, answer3, false);
		Solution solution4 = new Solution(4L, answer4, false);

		task1.setName("First task");
		task1.setMessage("What is the best coding language ?");
		task1.setCompleted(false);
		answer1.setTaskOptions(task1);
		task1.setOptions(List.of(answer1, answer2, answer3, answer4));
		taskService.addTask(task1);
		answerService.addAnswer(answer1);
		solutionService.addSolution(solution1);
		solutionService.addSolution(solution2);
		solutionService.addSolution(solution3);
		solutionService.addSolution(solution4);
	}
}
