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
		Task task2 = new Task();

		Answer answer1 = new Answer(1L, "Python", task1);
		Answer answer2 = new Answer(2L, "JS", task1);
		Answer answer3 = new Answer(3L, "JAVA", task1);
		Answer answer4 = new Answer(4L, "C#", task1);
		Answer answer5 = new Answer(5L, "HTML", task2);
		Answer answer6 = new Answer(6L, "CSS", task2);
		Answer answer7 = new Answer(7L, "Kotlin", task2);
		Answer answer8 = new Answer(8L, "C++", task2);

		Solution solution1 = new Solution(1L, answer1, true);
		Solution solution2 = new Solution(2L, answer2, false);
		Solution solution3 = new Solution(3L, answer3, false);
		Solution solution4 = new Solution(4L, answer4, false);
		Solution solution5 = new Solution(5L, answer5, false);
		Solution solution6 = new Solution(6L, answer6, true);
		Solution solution7 = new Solution(7L, answer7, false);
		Solution solution8 = new Solution(8L, answer8, false);

		task1.setId(1L);
		task1.setName("First task");
		task1.setMessage("What is the best coding language ?");
		task1.setCompleted(false);
		task1.setOptions(List.of(answer1, answer2, answer3, answer4));

		task2.setId(2L);
		task2.setName("Second task");
		task2.setMessage("What is the worst coding language");
		task2.setCompleted(false);
		task2.setOptions(List.of(answer5, answer6, answer7, answer8));

		taskService.addTask(task1);
		taskService.addTask(task2);

		answerService.addAnswer(answer1);
		answerService.addAnswer(answer2);
		answerService.addAnswer(answer3);
		answerService.addAnswer(answer4);
		answerService.addAnswer(answer5);
		answerService.addAnswer(answer6);
		answerService.addAnswer(answer7);
		answerService.addAnswer(answer8);

		solutionService.addSolution(solution1);
		solutionService.addSolution(solution2);
		solutionService.addSolution(solution3);
		solutionService.addSolution(solution4);
		solutionService.addSolution(solution5);
		solutionService.addSolution(solution6);
		solutionService.addSolution(solution7);
		solutionService.addSolution(solution8);
	}
}
