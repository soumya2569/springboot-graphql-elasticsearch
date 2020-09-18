package com.demo.graphql.springbootgrapqlexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.demo.graphql.springbootgrapqlexample.model.Book;


public interface BookRepository extends ElasticsearchRepository<Book, String> {
	
	@Query("{\"bool\": {\"must\": [{\"match\": {\"authors\": \"?0\"}}]}}")
	Page<Book> findByAuthor(String author, Pageable pageable);
	
}
