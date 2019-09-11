package com.example.bookdemo.repository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.bookdemo.BookApplication;
import com.example.bookdemo.model.Book;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = BookApplication.class)
@AutoConfigureMockMvc
public class DatabaseLoaderTest {
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	BookRepository repository;
	
	@Test
	public void contextLoads() throws Exception {
		Book book = new Book();
		book.setTitle("test");
		book.setIsbn(1l);
		book.setAuthor("test");
		book.setYearOfPublishing("2000");
		book.setNumOfPages(1);
		Mockito.when(repository.save(null)).thenReturn(new Book());
		mockMvc.perform(MockMvcRequestBuilders.get("/")
				)
				.andExpect(status().isOk());
	}
}
