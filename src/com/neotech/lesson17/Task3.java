package com.neotech.lesson17;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the mom's name");
		String momName=scanner.nextLine();
		System.out.println("enter the dad's name");
		String dadName=scanner.nextLine();
		System.out.println("enter the gender");
		String gender=scanner.nextLine();
		String name="";
		if(gender.equalsIgnoreCase("boy")) {
			name=dadName.substring(0,dadName.length()/2)
					+momName.substring(momName.length()/2, momName.length()-1);
		}
		else if (gender.equalsIgnoreCase("girl")) {
		name=momName.substring(0, momName.length()/2)+dadName.substring(dadName.length()/2, dadName.length()-1);
		}
		else {
			System.out.println("there is none");
		}
		System.out.println("name is: "+name);

	}

}
