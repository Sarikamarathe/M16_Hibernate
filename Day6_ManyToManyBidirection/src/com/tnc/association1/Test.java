package com.tnc.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(1);
		d.setName("Komal");
		em.persist(d);
		
		Employee e=new Employee();
		e.setId(101);
		e.setName("jaya");
		e.setDepartment("Computer");
		em.persist(e);
		
		em.getTransaction().commit();
		System.out.println("Added Employee and Manager Successfully");
		em.close();
		factory.close();
	}

}
