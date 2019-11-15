package com.calculator.dao;

import com.calculator.entity.Users;
import com.calculator.interfaces.UsersDAOLocal;
import com.calculator.interfaces.UsersDAORemote;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class UsersDAO
 */
@Stateless
@LocalBean
public class UsersDAO implements UsersDAORemote, UsersDAOLocal {

	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public UsersDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Users create(Users users) {
		em.persist(users);
		return users;
	}

	@Override
	public Users update(Users users) {
		em.merge(users);
		return users;
	}

	@Override
	public Users getUser(int id) {
		return em.find(Users.class, id);
	}

	@Override
	public List<Users> getAllUsers() {
		return null;
	}

}
