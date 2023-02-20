package com.bl;

import java.util.Arrays;

public class Main{

public static  void main(String[] args) {
		
	 EmpWage wage = new EmpWage();
     wage.companyDetails();
     System.out.println(wage.empWageBuilder);
     System.out.println("Daily Wage of "+ wage.empWageBuilder.get(0).getCompany()+" company : "+Arrays.toString(wage.wageStore));
     wage.addCompany();
}
}

