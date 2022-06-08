package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface CollegeRepository 
{
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College searchCollege(int id);
	public abstract College removeCollege(College college);



}
