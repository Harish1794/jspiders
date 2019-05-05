package org.jspiders.bookapphibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;;
@Entity
@Table(name="cricket")
public class CricketDTO implements Serializable
{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="t_name")
	private String t_name;
	@Column(name="t_captain")
	private String t_captain;
	@Column(name="t_rating")
	private int t_rating ;
	
	public CricketDTO() 
	{
		System.out.println("obj created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_captain() {
		return t_captain;
	}

	public void setT_captain(String t_captain) {
		this.t_captain = t_captain;
	}

	public int getT_rating() {
		return t_rating;
	}

	public void setT_rating(int t_rating) {
		this.t_rating = t_rating;
	}

	@Override
	public String toString() {
		return "CrickertDTO [id=" + id + ", t_name=" + t_name + ", t_captain=" + t_captain + ", t_rating=" + t_rating
				+ "]";
	}
		
}
