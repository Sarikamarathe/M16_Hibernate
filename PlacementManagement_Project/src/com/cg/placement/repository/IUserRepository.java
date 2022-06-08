package com.cg.placement.repository;

import com.cg.placement.entities.User;

public interface IUserRepository {

	public User addUser(User user); //C
	public User updateUser(User user); //U
	public User deleteUser(User user); //D
	public User searchUserById(int id); //R
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
