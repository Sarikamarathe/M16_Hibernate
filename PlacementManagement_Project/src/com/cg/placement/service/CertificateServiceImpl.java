package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CertificateServiceImpl implements CertificateService
{
	
	//Step 1:Establishing connection between Service and Repo

	private CertificateRepository dao;
	
	
	public CertificateServiceImpl()
	{
		dao= new CertificateRepositoryImpl();
	}

	//Step 2: Service calls to perform CRUD Operation

	@Override
	public Certificate addCertificate(Certificate certificate)
	{
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id)
	{
		Certificate certificate=dao.SearchCertificate(id);
		return certificate;
	}

	public Certificate removeCertificate(Certificate certificate)
	{
		dao.beginTransaction();
		dao.removeCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	
	

	
}
