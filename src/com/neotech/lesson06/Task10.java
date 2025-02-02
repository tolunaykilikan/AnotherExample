package com.neotech.lesson06;

import java.util.Scanner;

public class Task10 {
	/*1. Ask the user to enter the height in inches. Person should be classified as one of the following:
		• short (under 60 inch)
		• medium (between 60 -72 inch)
		• tall (over 72 inch)*/

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your height");
		double cm=scanner.nextDouble();
		double inc=(cm*0.3937);
		if(inc<60) {
			System.out.println("the person is "+inc+" inc.the person is short");
		}
		else if(inc>=60 && inc<=72) {
			System.out.println("the person is "+inc+" inc.the person is medium");
		}
		else if(inc>72) {
			System.out.println("the person is "+inc+" inc.the person is tall");
		}
		else {
			System.out.println("you enter the wrong value");
		}
	}

}
