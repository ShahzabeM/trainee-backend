package com.example.trainee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.trainee.model.Trainee;
import com.example.trainee.repository.TraineeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TraineeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TraineeRepository repo) {
		return args -> {
			repo.save(new Trainee(
					"Mikey",
					"Backend Developer",
					"Java, Spring Boot, SQL",
					"Experienced in building scalable backend systems.",
					"2 years at Jarvis",
					"Ontario Tech University",
					"Trainee Dashboard, Retail Analytics",
					"https://randomuser.me/api/portraits/men/75.jpg"
			));
			repo.save(new Trainee(
					"Bella",
					"Frontend Developer",
					"React, TypeScript, HTML/CSS",
					"Focused on responsive UI/UX with modern React frameworks.",
					"1.5 years at Jarvis",
					"University of Toronto",
					"Construction Site Monitor UI, Finance Tracker",
					"https://randomuser.me/api/portraits/women/44.jpg"
			));
			repo.save(new Trainee(
					"Ricky",
					"Data Analyst",
					"Python, Excel, Power BI",
					"Strong background in data wrangling, dashboards, and client reporting.",
					"3 years at PwC",
					"York University",
					"Retail Analytics, BI Dashboards, Forecasting Models",
					"https://randomuser.me/api/portraits/men/32.jpg"
			));
		};
	}

}
