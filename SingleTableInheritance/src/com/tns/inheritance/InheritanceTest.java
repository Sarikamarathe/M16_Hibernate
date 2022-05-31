package com.tns.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create as employee1
		Employee emp=new Employee();
		emp.setName("Jayu");
		emp.setSalary(35000);
		em.persist(emp);
		
		Employee emp1=new Employee();
		emp1.setName("Komal");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		Manager mg=new Manager();
		mg.setName("sonam");
		mg.setSalary(35000);
		mg.setDeptName("Information Technology");
		em.persist(mg);
		
		em.getTransaction().commit();
		System.out.println("Added Employee and Manager Successfully");
		em.close();
		factory.close();
	}
}
