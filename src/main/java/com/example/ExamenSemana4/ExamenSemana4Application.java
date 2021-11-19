package com.example.ExamenSemana4;

import com.example.ExamenSemana4.entity.Course;
import com.example.ExamenSemana4.entity.Expedient;
import com.example.ExamenSemana4.entity.Student;
import com.example.ExamenSemana4.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class ExamenSemana4Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSemana4Application.class, args);
	}
/*
	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository) {
		return args -> {

			SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
			Course A = new Course("English");
			Course B = new Course("Java");
			Course C = new Course("SQL");
			Course D = new Course("Extras");

			Expedient expedient1=new Expedient(null,9, null,A);
			Expedient expedient2=new Expedient(null,10, null,B);
			Expedient expedient3=new Expedient(null,10, null,C);
			Expedient expedient4=new Expedient(null,8, null,D);

			Student student1 = new Student("Miguel","Cisneros","Juarez 3"," ",List.of(expedient2,expedient3));
			Student student2 = new Student("Jesus","Pallares","Juarez 2"," " ,List.of(expedient1,expedient4));

			studentRepository.save(student1);
			studentRepository.save(student2);

		};
	}*/

}
