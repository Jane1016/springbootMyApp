package com.myapp.service;

import java.util.List;

import com.myapp.model.User;

public interface UserService {
	
	/**
	 * add user information
	 * @param user
	 * @return
	*/
	User saveUser(User user);
	

	/**
	 * update user information
	 * @param user
	 * @return
	*/
	User updateUser(User user);
	
	/**
	 * get user by id
	 * @param id
	 * @return
	*/	
	User getById(Long id);
	
	/**
	 * get user by name
	 * @param username
	 * @return
	*/	
	User getByUserName(String username);
	
	/**
	 * query all users
	 * @return
	*/
	List<User> queryAll();
	
	/**
	 * delete user by user id
	 * @param id
	 * @return
	*/
	void deleteById(Long id);

}
