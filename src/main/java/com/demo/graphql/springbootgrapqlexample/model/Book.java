package com.demo.graphql.springbootgrapqlexample.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName = "bookshelf", type = "bookdocument")
@Entity

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)   
    private long id;
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	@Version
    private Long version;
	@Column(name = "bookId", nullable = false)    
    private String bookId;
    @Column(name = "title")
    private String title;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "authors")
    private String authors;
    @Column(name = "publishedDate")
    private String publishedDate;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String bookId, String title, String publisher, String authors, String publishedDate) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.publishedDate = publishedDate;
	}
	
    

}
