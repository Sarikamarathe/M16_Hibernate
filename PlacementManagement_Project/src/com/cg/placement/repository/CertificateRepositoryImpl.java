package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;
//import com.cg.placement.entities.Student;
import com.cg.placement.entities.College;

public class CertificateRepositoryImpl implements CertificateRepository
{
	
	//start JPA LifeCycle

	private EntityManager entityManager;
	

	public CertificateRepositoryImpl( ) 
	{
		entityManager=JPAUtil.getEntityManager();
	}

	//Perform CRUD Operation

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		entityManager.merge(certificate);
		return certificate;		
	}

	@Override
	public Certificate SearchCertificate(int id) 
	{
		Certificate certificate=entityManager.find(Certificate.class,id);
		return certificate;
	}

	public Certificate removeCertificate(Certificate certificate)
	{
		entityManager.remove(certificate);
		return certificate;


	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}

	//changes require
	@Override
	public College addCollege(College college) 
	{
		entityManager.persist(college);
		return college;
	}

	//Changes
	@Override
	public College updateCollege(College college)
	{
		entityManager.merge(college);
		return college;
	}

	//changes
	@Override
	public College SearchCollege(int id) 
	{
		College college=entityManager.find(College.class,id);
		return college;
	}
	//changes
	@Override
	public College removeCollege(College college)
	{
		entityManager.remove(college);
		return college;
	}
	//changes
	@Override
	public boolean schedulePlacement(int placement)
	{
		((CertificateRepositoryImpl) entityManager).schedulePlacement(placement);
		return false;
	}

	
	

}
