package org.java.service;
import java.io.IOException;
import java.util.Date;

import org.java.model.News;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonEx {

	public static void main(String[] a){
		
		News emp = createDummyObject();
		ObjectMapper mapperObj = new ObjectMapper();
		
		try {
			// get Employee object as a json string
			String jsonStr = mapperObj.writeValueAsString(emp);
			System.out.println(jsonStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static News createDummyObject() {
		News  news = new News();
		news.setNewsContainType("Sports");
		news.setNewsHeading("Foot ball world cup");
		news.setNewsPriority("Breaking");
		news.setNewsContain("Final between England and Spain.England won the match ");
		Date date = new Date();
		news.setNewsTime(date);
		return news;
	}
}