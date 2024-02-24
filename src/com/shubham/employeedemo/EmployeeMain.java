package com.shubham.employeedemo;

import com.shubham.employeedemo.model.*;
import java.util.Scanner;

public class EmployeeMain {
	
	EmployeeModel employeemodel = new EmployeeModel();
	
	public void setinput() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Eid:");
		  employeemodel.seteid(scanner.nextInt());
			System.out.println("Enter the ename:");
			employeemodel.setename(scanner.next());
			System.out.println("Enter the salary:");
			employeemodel.setsalary(scanner.nextDouble());

		}
	public void getoutput() {

		System.out.println(" Eid=" +employeemodel.geteid());
		System.out.println(" ename=" +employeemodel.getename());
		System.out.println("salary=" + employeemodel.getsalary());
	}	

	public static void main(String[] args) {
		
		EmployeeMain employeemain = new EmployeeMain();
		employeemain.setinput();
		employeemain.getoutput();
	}

}
