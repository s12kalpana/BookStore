package com.example.bookdemo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bookdemo.model.Book;

@Component
public class DatabaseLoader implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(DatabaseLoader.class);
	private final BookRepository repository;

	@Autowired
	public DatabaseLoader(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repository.save(new Book("Book1", 123l, "David", "1995", 100));
		this.repository.save(new Book("Book2", 456l, "James", "1999", 30));
		this.repository.save(new Book("Book3", 412l, "Paul", "2000", 40));
		this.repository.save(new Book("Book4", 321l, "Kevin", "2002", 29));
		this.repository.save(new Book("Book5", 236l, "John", "2007", 150));
		this.repository.save(new Book("Book6", 542l, "Richard", "2015", 80));
		logger.info("Data loaded..");
	}
}