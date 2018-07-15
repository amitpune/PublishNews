package org.java.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.java.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NewsDaoImpl implements NewsDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<News> getAllNews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<News>  newsList = session.createCriteria(News.class).addOrder(Order.asc("newsTime")).list();
		//List<News>  newsList = session.createQuery("from News").list();
		return newsList;
	}

	public News getNews(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		News news = session.get(News.class, id);
		return news;
	}

	public News addNews(News news) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(news);
		return news;
	}

	public void updateNews(News news) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(news);
	}
	public List<News> getAllNewsForCache() {
		Session session = this.sessionFactory.getCurrentSession();
		List<News>  newsList = session.createCriteria(News.class).addOrder(Order.asc("newsTime")).setMaxResults(100).list();
		//List<News>  newsList = session.createQuery("from News").list();
		return newsList;
	}
	
}
