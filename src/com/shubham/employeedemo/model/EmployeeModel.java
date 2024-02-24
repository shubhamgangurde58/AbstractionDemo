package com.shubham.employeedemo.model;

public class EmployeeModel {

	int eid;
	String ename;
	double salary;
	
	public void seteid(int eid) {
		this.eid = eid;
	}
	public void setename(String ename) {
		this.ename = ename;
	}
	public void setsalary(double salary)
	{
		this.salary = salary;
	}
	
	public int geteid() {
		return this.eid;
	}
	public String getename() {
		return this.ename;
	}
	public double getsalary(){
		return this.salary;
	}
	
}
