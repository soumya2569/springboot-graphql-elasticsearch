package com.demo.graphql.springbootgrapqlexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
@SpringBootApplication
public class SpringBootGrapqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGrapqlExampleApplication.class, args);
	}
}
