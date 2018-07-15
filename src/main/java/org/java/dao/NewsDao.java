package org.java.dao;

import java.util.List;

import org.java.model.News;

public interface NewsDao {
	public List<News> getAllNews() ;

	public News getNews(int id) ;

	public News addNews(News customer);

	public void updateNews(News news) ;
	public List<News> getAllNewsForCache() ;
	
}
