package com.tnc.association1;
import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP_MATER")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee implements Serializable 
{
	private static final long serializableVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_no")
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	}




