package com.example.bookdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookdemo.model.Book;
import com.example.bookdemo.repository.BookRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryITests {

	@Autowired
	TestEntityManager entityManager;

	@Autowired
	BookRepository bookRepository;

	@Before
	public void Setup() {
		Book book = new Book();
		book.setTitle("test book title");
		book.setIsbn(1l);
		book.setAuthor("test");
		book.setYearOfPublishing("2000");
		book.setNumOfPages(50);
		entityManager.persistAndFlush(book);
	}

	@Test
	public void injectedComponentsAreNotNull() {
		assertThat(entityManager).isNotNull();
	}

	@Test
	public void findBook_byTitle_thenBookShouldBeFound() {
		Book book = bookRepository.findByTitle("test book title");
		assertThat(book).isNotNull();
		assertThat(book.getTitle()).isEqualTo("test book title");
		assertThat(book.getAuthor()).isEqualTo("test");
		assertThat(book.getYearOfPublishing()).isEqualTo("2000");
		assertThat(book.getNumOfPages()).isEqualTo(50);
	}

	@Test
	public void findBook_byIsbn_thenBookShouldBeFound() {
		Book book = bookRepository.findByIsbn(1l);
		assertThat(book.getIsbn()).isEqualTo(1l);
	}

	/*
	 * @Test public void search_byTitle_thenReturnAllBooksMatching() { List<Book>
	 * books = bookRepository.search("book"); assertThat(books).hasSize(1); }
	 */

}
