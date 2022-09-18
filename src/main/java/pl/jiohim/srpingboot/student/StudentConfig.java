package pl.jiohim.srpingboot.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student andrew = new Student(
                    1L,
                    "Andrei",
                    "a.tarkovsky@mail.com",
                    LocalDate.of(1956 , Month.JULY,5)
            );
            Student quentin = new Student(
                    "Quentin",
                    "q.tarantino@mail.com",
                    LocalDate.of(1980 , Month.JULY,15)
            );

            repository.saveAll(List.of(andrew,quentin));
        };
    }
}
