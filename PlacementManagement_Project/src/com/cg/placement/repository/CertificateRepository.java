package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;

public interface CertificateRepository 
{
	public abstract Certificate addCertificate(Certificate certificate);//Create
	public abstract Certificate updateCertificate(Certificate certificate);//Update
	public abstract Certificate SearchCertificate(int id);//Retrrive
	public abstract Certificate removeCertificate(Certificate certificate);//delete


	public abstract void beginTransaction();//Start the connection
	public abstract void commitTransaction();//End the connection
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College SearchCollege(int id);
	public abstract College removeCollege(College college);
	public abstract boolean schedulePlacement(int placement);

}
