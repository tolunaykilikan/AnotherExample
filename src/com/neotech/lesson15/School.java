package com.neotech.lesson15;

public class School {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.firstName="tolunay";
		s1.lastName="kilikan";
		s1.age=28;
		s1.grade='A';
		s1.studentId=123;
		s1.school="neotech";
		s1.study();
		s1.doHomework();
		s1.grade();
		
		Student s2=new Student();//object
		s2.firstName="tol";
		s2.lastName="kil";
		s2.age=28;
		s2.grade='B';
		s2.studentId=12583;
		s2.school="neotech";
		
		System.out.println("/////////////////////");
		s2.study();
		s2.doHomework();
		s2.grade();
       
	}

}
