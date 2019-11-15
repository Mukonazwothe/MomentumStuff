package com.calculator.managedbeans;

import javax.ejb.EJB;

import com.calculator.interfaces.UsersDAOLocal;

public class UsersMB {
	@EJB
	private UsersDAOLocal usersDAOLocal;
	public UsersMB() {
		
	}
	public static void main(String[] args) {
		
	}
}
