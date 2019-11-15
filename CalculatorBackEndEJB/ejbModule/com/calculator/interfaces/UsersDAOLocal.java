package com.calculator.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.calculator.entity.Users;

@Local
public interface UsersDAOLocal {
	public Users create(Users users);
	public Users update(Users users);	
	public Users getUser(int id);
	public List<Users> getAllUsers();
	
}
