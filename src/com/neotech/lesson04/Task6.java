package com.neotech.lesson04;

import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {

/*2. Create a Java program and name it TemperatureCheck.
Create a variable to store temperature.
Your program should check if the temperature is below 32
If the temperature is below 32
    then it should print "Water will freeze with temperature __",
    otherwise should print "Water will NOT freeze with temperature __".*/
	System.out.print("enter the temperature");
	Scanner scanner=new Scanner(System.in);
	double temp=scanner.nextDouble();
	if(temp<32) {
		System.out.println("Water will freeze with temperature "+temp+"F");
	}
	else {
		System.out.println("Water will NOT freeze with temperature "+temp+"F");
	}
}
}
