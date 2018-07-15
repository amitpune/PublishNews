package org.java.controller;

import java.util.List;

import org.java.model.News;
import org.java.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

	@Autowired
	NewsService newsService;

	@RequestMapping(value = "/getAllNews", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<News> getAllCustomers(Model model) {

		List<News> listOfCustomers = newsService.getAllNews();
		
		System.out.println("Request received");
		return listOfCustomers;
	}


	@RequestMapping(value = "/getNews/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public News  getCustomerById(@PathVariable int id) {
		System.out.println("Request received");
		return newsService.getNews(id);
	}

	@RequestMapping(value = "/addNews", method = RequestMethod.POST, headers = "Accept=application/json")
	public News addCustomer(@RequestBody News news) {
		return newsService.addNews(news);

	}

	@RequestMapping(value = "/updateNews", method = RequestMethod.PUT, headers = "Accept=application/json")
	public News updateCustomer(@RequestBody News news) {
		return newsService.updateNews(news); 

	}	
	
	// Implemented cash by using spring boot so No data base call every time.
	@RequestMapping(value = "/getAllNewsForCache", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<News> getAllNewsForCache(Model model) {
		List<News> listOfCustomers = newsService.getAllNewsForCache();
		return listOfCustomers;
	}

}
