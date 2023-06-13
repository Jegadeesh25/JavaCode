package com.javalearning.constructor;

//Passing the object reference to constructor

public class EmployeeInfo {
int empId;
String empName;

EmployeeInfo (int empId, String empName){       //creating constructor
	this.empId = empId;
	this.empName = empName; 
}
EmployeeInfo(EmployeeInfo obj){
	this.empId = obj.empId;
	this.empName = obj.empName;
}
public static void main(String [] args) {
	EmployeeInfo emp = new EmployeeInfo (1001,"Ajit");
	EmployeeInfo emp2 = new EmployeeInfo (emp);
	System.out.println(emp2.empId);
	System.out.println(emp2.empName);
}
	
}
