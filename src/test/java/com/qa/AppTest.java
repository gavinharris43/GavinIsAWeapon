package com.qa;


import org.junit.Test;

import com.google.gson.Gson;
import com.qa.ReverseString;


import static org.junit.Assert.*;



public class AppTest 
{
	
	ReverseString rString;
	AccountManagement aM= new AccountManagement(); 
	Account gavin= new Account("Gavin", "Harris");
	Account gavin1= new Account("Gavin", "Harris1");
	Gson jSON;
	
 @Test
 public void test1() {
	rString = new ReverseString();
	String test1Restlt= rString.reverseString("hello");
	 
	 assertEquals("olleh",test1Restlt);
 }
 @Test
 public void test2() {
	 Gson json= new Gson();
	 String toJSON= json.toJson(gavin);
	 
	 assertEquals("{\"fName\":\"Gavin\",\"lName\":\"Harris\",\"AccountNo\":10002}",toJSON);
	 
 }
 @Test 
 public void test3() {
	 Gson json= new Gson();
	 aM.addAccount(gavin);
	 aM.addAccount(gavin1);
	 String toJson= json.toJson(aM.viewMap());
	 assertEquals("{\"10004\":{\"fName\":\"Gavin\",\"lName\":\"Harris\",\"AccountNo\":10004},\"10005\":{\"fName\":\"Gavin\",\"lName\":\"Harris1\",\"AccountNo\":10005}}",toJson);
	 
	 
 }
 @Test 
 public void test4() {
	 Gson json= new Gson();
	 aM.addAccount(gavin);
	 aM.addAccount(gavin1);
	 String toJson= json.toJson(aM.viewAccount(10007));
	 assertEquals("{\"fName\":\"Gavin\",\"lName\":\"Harris1\",\"AccountNo\":10007}",toJson);
	 
	 
 }
}
