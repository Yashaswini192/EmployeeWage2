package com.bl;

public class Main {
	
    public static void main(String[] args) {
    	 int isPresent = 1;
    	 int isAbsent = 0;
    	 int daycount=0;
    	 int salaryPerHour = 20;
         int partTime=2;
    	 //workingDaysPerMonth=20
    	 int EmpMonthlySalary; 
    	 int WorkingHours=0;
         int totalWorkingHours;
        
         int checkAttendance = (int) ((Math.random() * 10) % 3);
         if(checkAttendance == isPresent) {
        	System.out.println("employee is present");
        	daycount=20;
        	WorkingHours=100;
        }else if (checkAttendance == partTime) {
        	System.out.println("employee is working part time");
        	daycount=10;
        	WorkingHours=50;
        }else if(checkAttendance == isAbsent){
        	System.out.println("employee is absent");
        }else {
        	System.out.println("no employee is working in this position");
        }
        totalWorkingHours = daycount *  WorkingHours ; 
        System.out.println(" workingHours:"+WorkingHours);
        int dailySalary= WorkingHours * salaryPerHour;
        System.out.println("DailySalary is:"+dailySalary);
        EmpMonthlySalary = totalWorkingHours * dailySalary ;
        System.out.println("Employee monthly Salary is :"+ EmpMonthlySalary);
     }
  }

