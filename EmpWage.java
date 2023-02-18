package com.bl;

public class EmpWage {

	public static final int part_time = 1;
	public static final int full_time = 2;
	private  static String company;
	private  static int wagePerHour;
	private static int totalWorkingHours;
	private  static int numOfWorkingDays;
	private static  int EmpMonthlyWages;

	public void EmpWageBuilderObject(String company,int wagePerHour,int totalWorkingHours,int numOfWorkingDays){
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.totalWorkingHours = totalWorkingHours;
		this.numOfWorkingDays = numOfWorkingDays;
	}

	public void Attendance() {

		int empHrs =  0,totalEmpHrs = 0, totalWorkingDays = 0;

		while(totalEmpHrs <= totalWorkingHours && totalWorkingDays < numOfWorkingDays) {

			totalWorkingDays++;
			int checkAttendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (checkAttendance) {
			case part_time:
				System.out.println("employee is present");
				empHrs = 4;
				break;
			case full_time:
				System.out.println("employee is absent");
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs; 
			System.out.println("day:" + totalWorkingDays + " Employee hour: " + empHrs);
			
		}
		EmpMonthlyWages = totalEmpHrs * wagePerHour ;
	}
	

	@Override
	public String toString() {
		return "EmpWage [company=" + company + ", wagePerHour=" + wagePerHour + ", totalWorkingHours="
				+ totalWorkingHours + ", numOfWorkingDays=" + numOfWorkingDays + ", EmpMonthlyWages=" + EmpMonthlyWages
				+ "]";
	}	

}



