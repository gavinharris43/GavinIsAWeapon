package com.qa;

import com.google.gson.Gson;

public class App {
ReverseString rstring;
 Account person;
 AccountManagement aManager= new AccountManagement();
 Gson json=new Gson();
	String personString =json.toJson(person);
	public App() {

	}
	

	public static void main(String[] args) {
		
		
	}

}
