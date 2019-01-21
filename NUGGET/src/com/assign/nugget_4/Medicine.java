package com.assign.nugget_4;



public class Medicine {
	private String company;
	private String address;
	
	
public Medicine(String company, String address) {
		super();
		this.company = company;
		this.address = address;
	}


public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


public  void displayLabel(){
	System.out.println("Company : "+getCompany() +String.format("%25s", "|Address: ") + getAddress());
	
}
}
