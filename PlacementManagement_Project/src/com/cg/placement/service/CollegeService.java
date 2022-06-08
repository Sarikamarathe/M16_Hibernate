package com.cg.placement.service;

import com.cg.placement.entities.College;

public interface CollegeService 
{
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College searchCollege(int id);
	public abstract College removeCollege(College college);
	public abstract boolean schedulePlacement(int placement); 

}
