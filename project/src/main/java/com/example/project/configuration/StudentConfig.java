package com.example.project.configuration;

import com.example.project.model.Student;
import com.example.project.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kokicha = new Student("Kokicha", LocalDate.of(2000, Month.JANUARY,20),"gamal@gimal.com");
            Student ludia = new Student("Krokicha", LocalDate.of(2005, Month.JANUARY,30),"gamal@gimal.com");

            repository.saveAll(
                    List.of(kokicha,ludia)
            );
        };
    }
}
