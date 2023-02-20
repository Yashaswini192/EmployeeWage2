package com.bl;

public class Company {
	private  String company;
	private  int totalWage;
	private   int numOfWorkingDays;
	
	public Company(String company, int totalWage, int numOfWorkingDays) {
		super();
		this.company = company;
		this.totalWage = totalWage;
		this.numOfWorkingDays = numOfWorkingDays;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int gettotalWage() {
		return totalWage;
	}

	public void settotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}

	public void setNumOfWorkingDays(int numOfWorkingDays) {
		this.numOfWorkingDays = numOfWorkingDays;
	}

	@Override
	public String toString() {
		return "Company [company=" + company + ", totalWage=" + totalWage + ", numOfWorkingDays=" + numOfWorkingDays
				+ "]";
	}
	
}
