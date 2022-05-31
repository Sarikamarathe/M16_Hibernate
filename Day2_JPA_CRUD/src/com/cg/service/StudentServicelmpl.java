package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaolmpl;
import com.cg.entities.Student;

public class StudentServicelmpl implements StudentService
{

	private StudentDao dao;
	
	public StudentServicelmpl()
	{
		dao=new StudentDaolmpl();
	}

	@Override
	public void addStudent(Student student)
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) {
		Student student=dao.getStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student)
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();		
	}

	@Override
	public void removeStudent(Student student)
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();		
	}

}
