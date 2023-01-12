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
		Task task3 = new Task();
		Task task4 = new Task();

		Answer answer1 = new Answer(1L, "True", task1);
		Answer answer2 = new Answer(2L, "False", task1);
		Answer answer3 = new Answer(3L, "String \"Text\";", task2);
		Answer answer4 = new Answer(4L, "String text = 'text';", task2);
		Answer answer5 = new Answer(5L, "String text = \"text\"", task2);
		Answer answer6 = new Answer(6L, "String text = \"text\";", task2);
		Answer answer7 = new Answer(7L, "Hyper Trainer Marking Language", task3);
		Answer answer8 = new Answer(8L, "Hyper Text Marketing Language", task3);
		Answer answer9 = new Answer(9L, "Hyper Text Markup Language", task3);
		Answer answer10 = new Answer(10L, "Hyper Text Markup Leveler", task3);
		Answer answer11 = new Answer(11L, "Object state can be replaced", task4);
		Answer answer12 = new Answer(12L, "Object state can't be replaced", task4);
		Answer answer13 = new Answer(13L, "Object state can be modified", task4);
		Answer answer14 = new Answer(14L, "Object state can’t be modified", task4);

		Solution solution1 = new Solution(1L, answer1, false);
		Solution solution2 = new Solution(2L, answer2, true);
		Solution solution3 = new Solution(3L, answer3, false);
		Solution solution4 = new Solution(4L, answer4, false);
		Solution solution5 = new Solution(5L, answer5, true);
		Solution solution6 = new Solution(6L, answer6, false);
		Solution solution7 = new Solution(7L, answer7, false);
		Solution solution8 = new Solution(8L, answer8, false);
		Solution solution9 = new Solution(9L, answer9, true);
		Solution solution10 = new Solution(10L, answer10, false);
		Solution solution11 = new Solution(11L, answer11, false);
		Solution solution12 = new Solution(12L, answer12, false);
		Solution solution13 = new Solution(13L, answer13, true);
		Solution solution14 = new Solution(14L, answer14, false);

		task1.setId(1L);
		task1.setName("First task");
		task1.setMessage("In Java, a method is a container that holds classes.");
		task1.setCompleted(false);
		task1.setOptions(List.of(answer1, answer2));

		task2.setId(2L);
		task2.setName("Second task");
		task2.setMessage("Which of the following is the correct way of making a string in Java?");
		task2.setCompleted(false);
		task2.setOptions(List.of(answer3, answer4, answer5, answer6));

		task3.setId(3L);
		task3.setName("Third task");
		task3.setMessage("What does HTML stand for?");
		task3.setCompleted(false);
		task3.setOptions(List.of(answer7, answer8, answer9, answer10));

		task4.setId(4L);
		task4.setName("Fourth task");
		task4.setMessage("String objects are immutable. What do we mean by that?");
		task4.setCompleted(false);
		task4.setOptions(List.of(answer11, answer12, answer13, answer14));

		taskService.addTask(task1);
		taskService.addTask(task2);
		taskService.addTask(task3);
		taskService.addTask(task4);

		answerService.addAnswer(answer1);
		answerService.addAnswer(answer2);
		answerService.addAnswer(answer3);
		answerService.addAnswer(answer4);
		answerService.addAnswer(answer5);
		answerService.addAnswer(answer6);
		answerService.addAnswer(answer7);
		answerService.addAnswer(answer8);
		answerService.addAnswer(answer9);
		answerService.addAnswer(answer10);
		answerService.addAnswer(answer11);
		answerService.addAnswer(answer12);
		answerService.addAnswer(answer13);
		answerService.addAnswer(answer14);


		solutionService.addSolution(solution1);
		solutionService.addSolution(solution2);
		solutionService.addSolution(solution3);
		solutionService.addSolution(solution4);
		solutionService.addSolution(solution5);
		solutionService.addSolution(solution6);
		solutionService.addSolution(solution7);
		solutionService.addSolution(solution8);
		solutionService.addSolution(solution9);
		solutionService.addSolution(solution10);
		solutionService.addSolution(solution11);
		solutionService.addSolution(solution12);
		solutionService.addSolution(solution13);
		solutionService.addSolution(solution14);

	}
}
