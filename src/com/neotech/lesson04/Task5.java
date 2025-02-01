package com.neotech.lesson04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*1. Create a Java program and name it DoubleComparison.
		Declare 2 double values and if the value of first the variable is higher then the second,
		print “Double value __ is larger than __ .”
		Otherwise print...*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter the first value");
		double num1=scanner.nextDouble();
		System.out.print("enter the second value");
		double num2=scanner.nextDouble();
		if(num1>num2) {
			System.out.println("Double value "+num1+" is larger than "+num2);
			}
		else {
			System.out.println("..........");
		}
	}

}
