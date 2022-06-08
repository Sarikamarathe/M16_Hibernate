package com.cg.placement.repository;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPAUtil 
{
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	
    }
	public static EntityManager getEntityManager()
	{
		if(entityManager==null || entityManager.isOpen()) 
		{
			entityManager=factory.createEntityManager();
		}
		return entityManager;
	}
}
