package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWage {

	ArrayList<Company> company = new ArrayList<>();

	public static final int part_time = 1;
	public static final int full_time = 2;
	//int numOfWorkingDays;
	int workingHours;
	int workingDays;


	public void companyDetails(){
		
		EmpWage c = new EmpWage();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Company Name:");
		String companyName = sc.nextLine();
		
		System.out.println("Enter Wage/Hour:");
		int wagePerHour = sc.nextInt();
		
		System.out.println("Enter Total working hours per month:");
		int totalHours = sc.nextInt();
		
		System.out.println("Enter Total working days per month");
		int totalWorkingDays = sc.nextInt();
		
		while(workingHours < totalWorkingDays && workingHours < totalHours){
			totalWorkingHours();
		}
		int totalWage = workingHours * wagePerHour ;
		
		Company comp = new Company(companyName,totalWage,workingHours);
		company.add(comp);

	}


	public int Attendance() {

		int checkAttendance = (int) Math.floor(Math.random() * 10) % 3;
		return checkAttendance;
	}

	public void totalWorkingHours() {
		EmpWage c = new EmpWage();

		switch (c.Attendance()) {
		case 0 :
			workingHours += 8;
			workingDays++;
			break;
		case 1:
			workingHours += 4;
			workingDays++;
			break;
		}
	}
	
	 public void addCompany() {
	        System.out.println("To calculate wage for another company press 1 \n press 2 to close the employee wage calculation");
	        Scanner sc = new Scanner(System.in);
	        int check = sc.nextInt();
	        if (check == 1) {
	            companyDetails();
	            System.out.println(company);
	            addCompany();
	        } else {
	            System.out.println("Company wage calculation closed");
	        }
	    }

}





