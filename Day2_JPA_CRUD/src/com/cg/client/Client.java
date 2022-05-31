package com.cg.client;


//import org.hibernate.Session;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServicelmpl;
public class Client {

	public static void main(String[] args) {
		StudentService obj=new StudentServicelmpl();
		Student student=new Student();
		
		//create
		student.setStudentId(101);
		student.setName("Sarika");
		obj.addStudent(student);
		
		//retrieve
		/*student=obj.findStuenftbyId(101);
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getName());
		*/
	}

}
