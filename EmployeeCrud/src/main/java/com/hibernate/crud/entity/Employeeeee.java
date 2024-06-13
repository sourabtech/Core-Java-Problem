package com.hibernate.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employeeeee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeeId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private long mobileno;
	@Column
	private String designation;
	
	public Employeeeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeeeee(int employeeeId, String firstName, String lastName, long mobileno, String designation) {
		super();
		this.employeeeId = employeeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileno = mobileno;
		this.designation = designation;
	}
	public int getEmployeeeId() {
		return employeeeId;
	}
	public void setEmployeeeId(int employeeeId) {
		this.employeeeId = employeeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long newMobileNumber) {
		this.mobileno = newMobileNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employeeeee [employeeeId=" + employeeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileno=" + mobileno + ", designation=" + designation + "]";
	}
	
	

}
