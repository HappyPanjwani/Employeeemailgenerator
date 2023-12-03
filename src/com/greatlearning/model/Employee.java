package com.greatlearning.model;

public class Employee {
	private String EmpFirstname;
	private String lastname;
	private String Emailid;
	private String password;
	
	public Employee() {}

	public Employee(String empFirstname, String lastname, String emailid, String password) {
		super();
		EmpFirstname = empFirstname;
		this.lastname = lastname;
		Emailid = emailid;
		this.password = password;
	}

	public String getEmpFirstname() {
		return EmpFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		EmpFirstname = empFirstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	}
	
		
		
		
	


