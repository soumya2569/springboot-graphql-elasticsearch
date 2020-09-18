package com.demo.graphql.springbootgrapqlexample.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.demo.graphql.springbootgrapqlexample.repository")
@EnableElasticsearchRepositories(basePackages = "com.demo.graphql.springbootgrapqlexample.repository")
@ComponentScan(basePackages = {"com.demo.graphql.springbootgrapqlexample.service"})

public class ConfigClass {
	@Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfiguration 
            = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
 
        return RestClients.create(clientConfiguration).rest();
    }
 
    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(client());
    }
}
