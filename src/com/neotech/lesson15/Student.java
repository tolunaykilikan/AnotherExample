package com.neotech.lesson15;

public class Student {
//features:
	//first name,last name,student ıd,age,school,grade
	String firstName,lastName,school;
	int studentId,age;
	char grade;
	//Behaviors
	//study(),doHomework(),...
	void study() {
		System.out.println(firstName+" "+lastName+" is studying!!");
	}
	void doHomework() 
	{
		System.out.println(firstName+" "+lastName+" is doing the homework!!");
	}
	void grade() {
		System.out.println(firstName+" has this grade "+grade);
	}
}
