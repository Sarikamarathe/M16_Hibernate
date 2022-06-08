package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
//import com.cg.placement.entities.Student;

public interface CertificateService 
{
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int id);
	public abstract Certificate removeCertificate(Certificate certificate);
	

}
