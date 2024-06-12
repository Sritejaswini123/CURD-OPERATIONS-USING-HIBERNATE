package com.flm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student { 
	@Id
	private int id;
	  
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qualification=" + qualification + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getQualification()=" + getQualification() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private String name;
	
	private String qualification;

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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}
