package org.student;

import org.department.Department;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Name of the Student is Shobana");
	}
	public void studentDept()
	{
		System.out.println("Student department is commerce");
	}
	public void studentId()
	{
		System.out.println("Student ID of Shobana is S786");
	}
	public static void main(String[] args) {
		
		Student std = new Student();
		System.out.println("Student Information");
		
		std.collegecode();
		std.collegeName();
		std.collegeRank();
		
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
		
	
	}
	
}
