package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	
	public static void main(String [] args) {
		Student s1=new Student();
		s1.roll=123;
		s1.name="Chaitali";
		s1.marks=80;
		
		s1.displayStudentDetails(s1.roll, s1.name, s1.marks);
//		s1=null

		Student s2=new Student();
		s2.roll=132;
		s2.name="Akshay";
		s2.marks=90;
		
		s2.displayStudentDetails(s2.roll, s2.name, s2.marks);
//		s2=null;
		s1=s2;
	}
	void displayStudentDetails(int roll,String name,int marks) {
		System.out.println("Roll No: "+roll);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
	}
}
