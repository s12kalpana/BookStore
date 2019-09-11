package com.example.bookdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.bookdemo.model.Book;
/**
 * This class is extended to add search functionality specific by book parameters
 * @author seela
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findByTitle(@Param("title") String title);

	public Book findByIsbn(@Param("isbn") Long isbn);

}
