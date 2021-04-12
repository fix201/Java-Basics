package com.java.basics.oop;

public class Encapsulation {
	public static void main(String args[]){
		Employee obj = new Employee();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 
}

/**
 * Encapsulation
 */
class Employee {

	private int ssn;
	private String empName;
	private int empAge;
	
	public Employee() {
		
	}

	public Employee(int ssn, String empName, int empAge) {
		this.ssn = ssn;
		this.empName = empName;
		this.empAge = empAge;
	}

	public int getEmpSSN() {
		return ssn;
	}

	public void setEmpSSN(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
