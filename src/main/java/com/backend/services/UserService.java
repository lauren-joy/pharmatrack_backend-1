package com.backend.services;

import java.util.List;

import com.backend.models.User;

public interface UserService {
	User saveUser(User user);
	List<User> getAllUsers();
	User getUserById(long id);
	User updateUser(User user, long id);
	void deleteUser(long id);
}