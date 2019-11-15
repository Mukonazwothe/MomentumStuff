package com.calculator.login;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="login")
public class Login {
	private String username;
	private String password;
	
	public Login(){
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
