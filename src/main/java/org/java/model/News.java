
package org.java.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * This is our model class and it corresponds to News table in database
 */
@Entity
@Table(name="NEWS")
public class News{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="newsContainType")
	String newsContainType; 

	@Column(name="newsPriority")
	String newsPriority;
	
	@Column(name="newsContain")
	String newsContain; 
	
	
	public String getNewsContain() {
		return newsContain;
	}

	public void setNewsContain(String newsContain) {
		this.newsContain = newsContain;
	}

	@Column(name="newsHeading")
	String newsHeading;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date newsTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewsContainType() {
		return newsContainType;
	}

	public void setNewsContainType(String newsContainType) {
		this.newsContainType = newsContainType;
	}

	public String getNewsPriority() {
		return newsPriority;
	}

	public void setNewsPriority(String newsPriority) {
		this.newsPriority = newsPriority;
	}

	public String getNewsHeading() {
		return newsHeading;
	}

	public void setNewsHeading(String newsHeading) {
		this.newsHeading = newsHeading;
	}

	public Date getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}
	
	
	
	
}
