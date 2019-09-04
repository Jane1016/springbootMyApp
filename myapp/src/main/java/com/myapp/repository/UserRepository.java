package com.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * get user by userName
	 * @param userName
	 * @return
	 */
	User findUserByUserName(String userName);

}
