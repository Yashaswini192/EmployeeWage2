package com.bl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmpWage {

	ArrayList<Company> empWageBuilder = new ArrayList<>();
	 int [] wageStore = new int[30];
	 
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
		
		int j = 1;
		//totalHours = 0;
		//totalWorkingDays = 0;
		
		while(workingHours < totalWorkingDays && workingHours < totalHours){
			int i = totalHours;
			totalWorkingHours();
            int wage = (i - totalHours) * 20;
            System.out.println("Day "+ j + " : "+wage);
            wageStore[j] = wage;
            j= j+1;
		}
		
		int totalWage = workingHours * wagePerHour ;
		
		Company comp = new Company(companyName,totalWage,workingHours);
		empWageBuilder.add(comp);

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
	
	 int check = 1;
	 public void addCompany() {
	        System.out.println("To calculate wage for another company press 1 \n press 2 to close the employee wage calculation");
	        Scanner sc = new Scanner(System.in);
	        int c = sc.nextInt();
	        if (c == 1) {
	        	companyDetails();
	            System.out.println(empWageBuilder);
	            System.out.println("Daily Wage of "+empWageBuilder.get(check).getCompany()+" company : "+ Arrays.toString(wageStore));
	            check = check + 1;
	            addCompany();
	        } else {
	            System.out.println("Company wage calculation closed");
	        }
	    }

}





