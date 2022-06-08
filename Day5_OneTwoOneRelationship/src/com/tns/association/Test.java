package com.tns.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create as employee1
		Employee emp=new Employee();
		emp.setName("Komal");
		emp.setId(1);
		emp.setAddress("Shahada");
		em.persist(emp);
		
		
		
		/*Address mg=new Address();
		mg.setAddressId(1);
		mg.setCity("Shahada");
		mg.setZipcode(425409);
		mg.setStreet("Computer Lines");
		mg.setState("Maharashtra");
		emp.setAddress(mg);
		em.persist(mg);*/
		
		em.getTransaction().commit();
		System.out.println("Added Employee and Manager Successfully");
		em.close();
		factory.close();
	}

	

}
