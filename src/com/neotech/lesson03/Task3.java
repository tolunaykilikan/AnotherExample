
package com.neotech.lesson03;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	/*2. Write a java program that converts mile to km and km to miles.
	Use scale 1 mile = 1.609344.
	Print the conversion on the console.
	For example: 10 miles is 16.09344 kilometers*/
	Scanner scanner=new Scanner(System.in);
	System.out.print("km: ");
	int km=scanner.nextInt();
	double mile=1.609344;
	double a=mile*km;
	System.out.println("mile is: "+a);
	System.out.print("mile: ");
	double mile1=scanner.nextDouble();
	double b=km/mile1;
	System.out.println("km is : "+b);
	
}
}
