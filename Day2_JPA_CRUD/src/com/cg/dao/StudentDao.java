package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao
{
	public abstract Student getStudentById(int id);//retrieve
	public abstract Student addStudent(Student students);//creation
	public abstract Student updateStudent(Student students);//update
	public abstract Student removeStudent(Student students);//delete
	
	public abstract void beginTransaction();//to start the connection
	public abstract void commitTransaction();//to end the connection
	
}
