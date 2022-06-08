package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
//import com.cg.placement.entities.Student;
import com.cg.placement.service.CertificateService;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.CollegeService;
import com.cg.placement.service.CollegeServiceImpl;

public class Client {

	public static void main(String[] args) {

		CertificateService obj = new CertificateServiceImpl(); 
		Certificate certificate=new Certificate();
		
		//Create
		certificate.setId(104);
		certificate.setYear(2020);
		certificate.setCollege_Name("Shahada");
		obj.addCertificate(certificate);
		
	
		College college=new College();
		college.setId(3);
		college.setCollegeAdmin("Mamata Girase");
		college.setCollegeName("R.C Patel");
		college.setLocation("Shirpur");
		//obj1.addCollege(college);
		//obj1.scheduslePlacement(placement);
		
		
		//certificate.setCertificate(college);
		//college.setCertificate(certificate);
		
		
		/*Student student=new Student(); 
		student.setId(1);
		student.setName("Aman");
		student.setCollege("Pune");
		student.setRoll(12);
		student.setQualification("BE");
		student.setCourse("Computer");
		student.setYear(2021);
		obj.addStudent(student);*/
		
		
		/*//Searching
		certificate=obj.searchCertificate(101);
		System.out.println("Id is :"+certificate.getId());
		System.out.println("Year is:"+certificate.getYear());
		System.out.println("College Name is :"+certificate.getCollege_Name());*/
			
		/*//update
		certificate=obj.searchCertificate(4);
		certificate.setId(103);
		obj.updateCertificate(certificate);
		System.out.println("update successfully");*/
		
		
		/*//delete
		certificate=obj.searchCertificate(4);
		//certificate.setYear(2021);
		obj.removeCertificate(certificate);
		System.out.println("deleted successfully");
		*/
		
		

	}

}
