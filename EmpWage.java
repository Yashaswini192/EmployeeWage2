package com.bl;

public class EmpWage {

	static int isPresent = 1 ;
	static int isAbsent = 0 ;
	static int part_time = 2;
	static int wagePerHour = 20;
	static int fulldayHours = 20;
	static int workingDaysPerMonth = 20;
	static int totalWorkingHours = 0;
	static int WorkingHours = 0;

	public void Attendance() {

		int checkAttendance = (int) ((Math.random() * 10) % 4);
		switch (checkAttendance) {
		case 1:
			System.out.println("employee is present");
			WorkingHours = 100;
			workingDaysPerMonth = 20;
			break;
		case 2:
			System.out.println("employee is absent");
			WorkingHours = 0;
			workingDaysPerMonth = 0;
			break;
		case 3:
			System.out.println("employee is working part time");
			WorkingHours = 50;
			workingDaysPerMonth = 10;
			break;
		default:
			System.out.println(" employee need to be hired");
			break;
		}
	}				
}

class Dailywages extends EmpWage{ //single Inheritance


	public void dailywage() {

		totalWorkingHours = workingDaysPerMonth *  WorkingHours ; 
		System.out.println("totalworkingHours:"+totalWorkingHours);

		int dailyWages = WorkingHours * wagePerHour ;
		System.out.println("dailywages:"+dailyWages);

		int MonthlyWages = totalWorkingHours * dailyWages ;
		System.out.println("Employee monthly wages is :" +MonthlyWages);

	}
}
