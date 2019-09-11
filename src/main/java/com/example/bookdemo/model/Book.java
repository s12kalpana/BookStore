package com.example.bookdemo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
/**
 * The Book - holds the required information for storing
 * @author seela
 *
 */
@Entity
public class Book {

	private @Id @GeneratedValue Long id;
	@NotNull
	private String title;
	@NotNull
	private Long isbn;
	private String author;
	private String yearOfPublishing;
	private int numOfPages;

	public Book() {
	}

	public Book(String title, Long isbn, String author, String yearOfPublishing, int numOfPages) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
		this.numOfPages = numOfPages;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, isbn);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Book book = (Book) o;
		return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(isbn, book.isbn);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(String yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return "Book {id=" + id + ", title=" + title + ", isbn=" + isbn + ", author=" + author + ", yearOfPublishing="
				+ yearOfPublishing + ", numOfPages=" + numOfPages + "}";
	}

}
