package com.bl;

public class EmpWage {

	static int isPresent = 1 ;
	static int isAbsent = 0 ;
	static final int part_time = 1;
	static final int full_time = 2;
	//static int wagePerHour = 20;
	//static int fulldayHours = 20;
	//static int workingDaysPerMonth = 2;
	//static int totalWorkingHours = 0;
	//static int WorkingHours = 0;

	public static int Attendance(String company,int wagePerHour,int totalWorkingHours,int numOfWorkingDays) {

		int empHrs =  0,totalEmpHrs = 0, totalWorkingDays =0;

		while(totalEmpHrs <= totalWorkingHours && totalWorkingDays < numOfWorkingDays) {

			totalWorkingDays++;
			int checkAttendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (checkAttendance) {
			case part_time:
				System.out.println("employee is present");
				empHrs = 4;
				//workingDaysPerMonth = 20;
				break;
			case full_time:
				System.out.println("employee is absent");
				empHrs = 8;
				//workingDaysPerMonth = 0;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs; 
			System.out.println("day:" + totalWorkingDays + " Employee hour: " + empHrs);
		}


		int EmpMonthlyWages = totalEmpHrs * wagePerHour ;
		System.out.println("Employee monthly wages for company: " + company + " is :"+ EmpMonthlyWages);
		return EmpMonthlyWages;

	}				
}

/*class Dailywages extends EmpWage{ //single Inheritance


	public void dailywage() {

	//	totalWorkingHours = workingDaysPerMonth *  WorkingHours ; 
	//	System.out.println("totalworkingHours:"+totalWorkingHours);

	//	int dailyWages = WorkingHours * wagePerHour ;
		System.out.println("dailywages:"+dailyWages);

		int MonthlyWages = totalWorkingHours * dailyWages ;
		System.out.println("Employee monthly wages is :" +MonthlyWages);

	}
}*/
