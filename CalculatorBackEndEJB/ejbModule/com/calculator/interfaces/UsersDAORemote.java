package com.calculator.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.calculator.entity.Users;

@Remote
public interface UsersDAORemote {
	public Users create(Users users);
	public Users update(Users users);	
	public Users getUser(int id);
	public List<Users> getAllUsers();

}
