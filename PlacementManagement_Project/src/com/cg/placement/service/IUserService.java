package com.cg.placement.service;

import com.cg.placement.entities.User;

public interface IUserService {

	public User addUser(User user); //C
	public User updateUser(User user); //U
	public User deleteUser(User user); //D 
	public User searchUserById(int id); //R
}
