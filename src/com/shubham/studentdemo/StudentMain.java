package com.shubham.studentdemo;

import java.util.Scanner;
import com.shubham.studentdemo.model.*;
public class StudentMain {

	StudentModel studentmodel = new StudentModel();
		
		public void setinput() {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the std:");
			studentmodel.setstd(scanner.nextInt());
			System.out.println("Enter the Rollno:");
			studentmodel.setrollno( scanner.nextInt());
			System.out.println("Enter the name: ");
			studentmodel.setname(scanner.next());
			System.out.println("Enter the fees:");
			studentmodel.setfees(scanner.nextDouble());
		}
		
		public void getoutput() {
			System.out.println("std:"+studentmodel.getstd());
			System.out.println("Rollno:"+studentmodel.getrollno());
			System.out.println("name:"+studentmodel.getname());
			System.out.println("Fees:"+studentmodel.getfees());
		}
		public static void main(String[] args) {
			StudentMain studentmain = new StudentMain();
			studentmain.setinput();
			studentmain.getoutput();

			}
}
