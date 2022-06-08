package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.repository.CertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CollegeServiceImpl implements CollegeService
{
private CertificateRepository dao;
	
	
	public CollegeServiceImpl()
	{
		dao= new CertificateRepositoryImpl();
	}


	@Override
	public College addCollege(College college) 
	{
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}


	@Override
	public College updateCollege(College college) 
	{
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}


	@Override
	public College searchCollege(int id) 
	{
		College college=dao.SearchCollege(id);
		return college;
	}


	@Override
	public College removeCollege(College college) 
	{
		dao.beginTransaction();
		dao.removeCollege(college);
		dao.commitTransaction();
		return college;
	}


	@Override
	public boolean schedulePlacement(int placement)
	{
		dao.beginTransaction();
		dao.schedulePlacement(placement);
		dao.commitTransaction();
		return false;
	}
}
