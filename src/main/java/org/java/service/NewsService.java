package org.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.java.dao.NewsDao;
import org.java.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("newsService")
public class NewsService {

	@Autowired
	NewsDao newsDao;

	@Transactional
	public List<News> getAllNews() {
		return newsDao.getAllNews();
	}

	@Transactional
	public News getNews(int id) {
		return newsDao.getNews(id);
	}

	@Transactional
	@CacheEvict(value = "allNews",allEntries = true) 
	public News addNews(News news) {
		newsDao.addNews(news);
		return news;
	}

	@Transactional
	@CacheEvict(value = "allNews",allEntries = true) 
	public News updateNews(News customer) {
		newsDao.updateNews(customer);
		return customer;
	}

	@Transactional
	@Cacheable(value="allNews")
	public List<News> getAllNewsForCache() {
		return newsDao.getAllNewsForCache();
	}
	
}
