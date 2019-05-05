package org.jspiders.bookapphibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="movies")
public class MoviesDTO implements Serializable
{
	@Id
	@Column(name="m_id")
	private int id;
	@Column(name="name")
	private String name ;
	@Column(name="rating")
	private int rating;
	@Column(name="lang")
	private String lang;
	
	public MoviesDTO() 
	{
		System.out.println("obj created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "MoviesDTO [id=" + id + ", name=" + name + ", rating=" + rating + ", lang=" + lang + "]";
	}
	
}
