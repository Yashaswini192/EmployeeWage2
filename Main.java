package com.bl;

public class Main {

public static  void main(String[] args) {
		
		EmpWage empwage = new EmpWage();
		empwage.EmpWageBuilderObject("TCS", 20,2,10);
		System.out.println(empwage);
		empwage.EmpWageBuilderObject("Profilics",15,2,10);
		System.out.println(empwage);
}
}

