package com.example.demo;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {

			Book bk1 = new Book("ReactJs", "Duc Ngo", 2020, "1234567", 20);
			Book bk2 = new Book("ReactTs", "Duc Ngo", 2022, "1234567", 21);
			Book bk3 = new Book("JavaScript", "Duc Ngo", 2021, "1234567", 22);
			Book bk4 = new Book("NodeJs", "Duc Ngo", 2022, "1234567", 23);

			repository.save(bk1);
			repository.save(bk2);
			repository.save(bk3);
			repository.save(bk4);

		};

	}

}
