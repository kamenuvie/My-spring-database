package com.example.Spring_data_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student student1 = new Student(
					"branch",
					"root",
					"root@mg.ru.edu",
					20,
					1111
			);
			studentRepository.save(student1);

			Student student2 = new Student(
					"student2",
					"student2",
					"student2@mg.ru.edu",
					18,
					1111000);
			studentRepository.save(student2);



		};
	}

}
