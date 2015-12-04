package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.business.Product;
import com.example.business.User;
import com.example.dao.ProductDao;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;

public class UserService {

	UserDao dao = new UserDao();
	
	public User login(String username, String password){
		
		User u = null;
		try {			
			u = dao.findUserByUsernamePassword(username, password);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		
		try {
			users = dao.getAllUsers();
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return users;
	}
}
