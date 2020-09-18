package com.demo.graphql.springbootgrapqlexample.graphql.type;

import org.springframework.stereotype.Component;

@Component
public class BookInputReq {
		
	private long id;
	  	private String bookId;							
	    private String title;
	    private String publisher;
	    private String authors;
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
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	    

}
