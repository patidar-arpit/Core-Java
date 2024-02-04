package com.core;

public class Employee implements Comparable<Employee> {
          
	private String empId;
	private String name;
	private double sal;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(String empId, String name, double sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}
	
	//@Override
	public boolean equals(Object o) {
		System.out.println("In equals");
		if(o instanceof Employee) {
			Employee e1 = (Employee)o; 
			return this.empId.equals(e1.empId);
		}
		
		return false;
		
	}
	@Override
	public int hashCode() {
	  System.out.println("In hasCode()");
	  //return 100;
	  //return the hashcode of the pK instead of returning 100 beacuse if we return always 100 the elements are always get added on the same 
	  // bucket/bin  of the hashtable. and it decreases the performance
	  return this.empId.hashCode();
	}
	@Override
	public int compareTo(Employee e) {
		
		return this.empId.compareTo(e.empId);
	}
	
}
