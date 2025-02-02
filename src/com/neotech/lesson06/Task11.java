package com.neotech.lesson06;

import java.util.Scanner;

public class Task11 {
	/*Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
		If any day from 1-5 → output "It is a weekday"
		Any day from 6-7 → output "It is a weekend",
		Any other day → output "Invalid day"*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("can you enter the number");
     int num=scanner.nextInt();
     if(num>=1 && num<=5) {
    	 System.out.println("it is  a weekday");
     }
     else if(num>=6 && num<=7) {
    	 System.out.println("it is weekend");
     }
     else {
    	 System.out.println("invalid day");
     }
	}

}
