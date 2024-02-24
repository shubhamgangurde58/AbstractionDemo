package com.shubham.studentdemo.model;

public class StudentModel {
	
	private int rollno;
	private String name;
	private int std;
	private double fees;
	
	public void setstd(int std) {
		this.std = std;
	}
	public void setrollno(int rollno) {
		this.rollno = rollno;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setfees(double fees) {
		this.fees = fees;
	}
	
	public int getstd() {
		return this.std;
	}
	public int getrollno() {
		return this.rollno;
	}
	public String getname() {
		return this.name;
	}
	
	public double getfees() {
		return this.fees;
	}
}
