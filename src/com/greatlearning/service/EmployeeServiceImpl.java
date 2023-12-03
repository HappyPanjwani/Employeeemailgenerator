package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fname, String lname, String deptName) {
		
		return fname+lname+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghigkjmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;
		String myPass="";
		Random random=new Random();
		for(int i=1;i<=8;i++)
		{
			myPass=myPass +String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return myPass;
	}
		
		
	

	@Override
	public void showEmployeeDetails(Employee e) {
		System.out.println("Emp first name is: "+ e.getEmpFirstname());
		System.out.println("Emp last name is: "+ e.getLastname());
		System.out.println("Employee emain is:"+ e.getEmailid());
		System.out.println("Employee password is:"+ e.getPassword());

		
	}

}
