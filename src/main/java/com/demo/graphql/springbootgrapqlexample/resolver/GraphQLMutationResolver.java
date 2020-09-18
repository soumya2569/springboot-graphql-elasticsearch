package com.demo.graphql.springbootgrapqlexample.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.graphql.springbootgrapqlexample.graphql.type.BookInputReq;
import com.demo.graphql.springbootgrapqlexample.service.GraphQLService;

@Component
public class GraphQLMutationResolver implements com.coxautodev.graphql.tools.GraphQLMutationResolver {

	
	
	@Autowired
	GraphQLService graphQLService;
	public String saveBookDetail(BookInputReq BookInputReq) {
		return graphQLService.saveBookDetail(BookInputReq);
		
	}
	

}
