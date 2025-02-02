package com.neotech.lesson06;

import java.util.Scanner;

public class Task14 {
/*3. Create a Java program that will ask user to input city and temperature.
    Your program should convert Fahrenheit into Celsius and print "The temperature is the city __ is __"*/
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your city");
		String city=scanner.nextLine();
		System.out.println("enter the temp");
		double temp=scanner.nextDouble();
		double fahren=temp;
		double celcius=(fahren-32)/1.8;
		System.out.println("the temperature is the city "+city+" is "+celcius+" C");
	}

}
