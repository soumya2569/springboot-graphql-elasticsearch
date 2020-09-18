package com.demo.graphql.springbootgrapqlexample.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.demo.graphql.springbootgrapqlexample.model.Book;
import com.demo.graphql.springbootgrapqlexample.service.GraphQLService;

@Component
public class GraphQLQueryResolver implements com.coxautodev.graphql.tools.GraphQLQueryResolver {

	@Autowired
	GraphQLService graphQLService;
	
	public Book getBook(String bookId) {
		return graphQLService.getBook(bookId);
		
	}
	public List<Book> getAllBookByAuthor(String authorName) {
		return graphQLService.getAllBookByAuthor(authorName);
		
	}
	public List<Book> getAllBook() {
		return graphQLService.getAllBook();
	}
	
}
