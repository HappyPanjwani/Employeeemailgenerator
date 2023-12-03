package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {
	public static void main(String[] args) {
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
				System.out.println("Please enter your first name:");
		String firstName=sc.next();
	System.out.println("please enter your last name");
	String lastName=sc.next();
	System.out.println("1. Technical");
	System.out.println("2.Admin");
	System.out.println("HR");
	System.out.println("Legal");
	int choice=sc.nextInt();
	
	String genEmail="";
	String genPassword="";
	
	switch(choice)
	{
	case 1:genEmail= empImpl.generateEmailID(firstName,lastName,"technical");break;
	case 2:genEmail= empImpl.generateEmailID(firstName,lastName,"admin");break;
	case 3:genEmail= empImpl.generateEmailID(firstName,lastName,"hr");break;
	case 4:genEmail= empImpl.generateEmailID(firstName,lastName,"legal");break;
	
	default: System.out.println("Please enter valid input!!");
	
	}
      genPassword=empImpl.generatePassword();
      Employee e1=new Employee();
      e1.setEmpFirstname(firstName);
      e1.setLastname(lastName);
      e1.setEmailid(genEmail);
      e1.setPassword(genPassword);
      empImpl.showEmployeeDetails(e1);
}
}