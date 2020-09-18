package com.demo.graphql.springbootgrapqlexample.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.demo.graphql.springbootgrapqlexample.graphql.type.BookInputReq;
import com.demo.graphql.springbootgrapqlexample.model.Book;
import com.demo.graphql.springbootgrapqlexample.repository.BookRepository;
import com.google.common.collect.Lists;

@Service
@Transactional
public class GraphQLService {

    @Autowired
    BookRepository bookRepository;

	/*
	 * @Value("classpath:books.graphql") Resource resource;
	 */
    
    public Book getBook(String bookId) {
		return bookRepository.findById(bookId).get();
    	
    }
    
    public List<Book> getAllBookByAuthor(String authorName) {
    	
    	Page<Book> pageofBook = bookRepository.findByAuthor(authorName,  PageRequest.of(0, 10));
	   return pageofBook.getContent();
    	
    }
    
    public List<Book> getAllBook() {
    	   	
    	
    	return Lists.newArrayList(bookRepository.findAll());
    	
    }
    
    public String saveBookDetail(BookInputReq BookInputReq) {
    	Book book =  new Book();
    	book.setId(BookInputReq.getId());
    	book.setBookId(BookInputReq.getBookId());
    	book.setAuthors(BookInputReq.getAuthors());
    	book.setPublisher(BookInputReq.getPublisher());
    	book.setTitle(BookInputReq.getTitle());
    	book.setPublishedDate(BookInputReq.getPublishedDate());
    	book.setVersion(System.currentTimeMillis());
    	bookRepository.save(book);
    	return "Book Saved";

    }
}
