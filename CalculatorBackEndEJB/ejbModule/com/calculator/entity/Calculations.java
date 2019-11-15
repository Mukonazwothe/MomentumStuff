package com.calculator.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Calculations
 *
 */
@Entity

public class Calculations implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String request;
	private String username;
	private String answer;
	private Date time;
	private static final long serialVersionUID = 1L;

	public Calculations() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
   
}
