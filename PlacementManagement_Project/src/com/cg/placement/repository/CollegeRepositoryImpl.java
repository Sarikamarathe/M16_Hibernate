package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;

public class CollegeRepositoryImpl implements CollegeRepository
{
	private EntityManager entityManager;
	
	public CollegeRepositoryImpl( ) 
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college)
	{
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college)
	{
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) 
	{
		College college=entityManager.find(College.class,id);
		return college;
	}

	@Override
	public College removeCollege(College college)
	{
		entityManager.remove(college);
		return college;
	}

}
