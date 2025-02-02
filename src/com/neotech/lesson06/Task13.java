package com.neotech.lesson06;

import java.util.Scanner;

public class Task13 {
	/*You are DMV representative and you need to ask customer their age.
    If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.*/
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter your age");
		int age=scanner.nextInt();
		if(age>=18) {
			System.out.println("you will issue a driver license");
		}
		else if(age>=14 && age<=17) {
			System.out.println("you can get learner permit");
		}
		else {
			System.out.println("wrong age value");
		}
		
	}

}
