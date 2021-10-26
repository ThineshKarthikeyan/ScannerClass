package com.omega.tss;

import java.util.Scanner;

public class EmployeeInfo {
	
	public void empId(int a) {
		System.out.println("Employee ID: " + a);
	}
	
	public void name(String b) {
		System.out.println("Employee Name: " + b);
	}
	
	public void email(String c) {
		System.out.println("Employee E-mail: " + c);
	}
	
	public void phoneNumber(long d) {
		System.out.println("Employee Phone Number: " + d);
	}
	
	public void salary(int e) {
		System.out.println("Employee Salary: " + e);
	}
	
	public void gender(String f) {
		System.out.println("Employee Gender: " + f);
	}
	
	public void city(String g) {
		System.out.println("Employee City: " + g);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int a = s.nextInt();
		System.out.println("Enter Employee Name: ");
		String b = s.next();
		System.out.println("Enter Employee email: ");
		String c = s.next();
		System.out.println("Enter Employee phoneNumber: ");
		long d = s.nextLong();
		System.out.println("Enter Employee salary: ");
		int e = s.nextInt();
		System.out.println("Enter Employee gender: ");
		String f = s.next();
		System.out.println("Enter Employee city: ");
		String g = s.next();
		
		EmployeeInfo info = new EmployeeInfo();
		info.empId(a);
		info.name(b);
		info.email(c);
		info.phoneNumber(d);
		info.salary(e);
		info.gender(f);
		info.city(g);
	}
}
