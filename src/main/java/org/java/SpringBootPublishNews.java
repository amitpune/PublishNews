package org.java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootPublishNews {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootPublishNews.class, args);   
	}
}