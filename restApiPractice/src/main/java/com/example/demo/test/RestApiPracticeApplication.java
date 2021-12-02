package com.example.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 * A logger, to send output to the log (the console, in this example).

A RestTemplate, which uses the Jackson JSON processing library to process the incoming data.

A CommandLineRunner that runs the RestTemplate (and, consequently, fetches our quotation) on startup.
 * */
@SpringBootApplication
public class RestApiPracticeApplication {
	private static final Logger log = LoggerFactory.getLogger(RestApiPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestApiPracticeApplication.class, args);
	}
	
	

	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 * 
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception {
	 * 
	 * return args -> { Quote quote = restTemplate.getForObject(
	 * "https://quoters.apps.pcfone.io/api/random", Quote.class);
	 * log.info(quote.toString()); };
	 * 
	 * 
	 * return args -> { TransactionLogDummy quote = restTemplate.getForObject(
	 * "https://jsonmock.hackerrank.com/api/transactions/",
	 * TransactionLogDummy.class); log.info(quote.toString()); };
	 * 
	 * }
	 */

}
