package com.qa;

public class Account {
	private String fName;
	private String lName;
	private Integer AccountNo;
	private static Integer counter = 10000; 

	public Account(String fName,String lName) {
		this.fName=fName;
		this.lName=lName;
		this.AccountNo=counter;
		counter++;
		// TODO Auto-generated constructor stub
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getAccountNo() {
		return AccountNo;
	}

	

}
