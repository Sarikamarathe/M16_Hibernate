package com.cg.placement.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate 
{
	@Id
	//@Column(name="Certificate_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private int Year;
	private String College_Name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Certificate_Id")

	private College college;
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getCollege_Name() {
		return College_Name;
	}
	public void setCollege_Name(String college_Name) {
		College_Name = college_Name;
	}
	
	
}
