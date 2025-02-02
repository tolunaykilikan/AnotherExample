package com.neotech.lesson06;

import java.util.Scanner;

public class TASK15 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first value");
		int a=scanner.nextInt();
		System.out.println("enter the second value");
		int b=scanner.nextInt();
		System.out.println("operator +/*-");
		String c = scanner.nextLine();
		
		
		if( c.equals("+")) {
			System.out.println(a+b);
		}
		else if(c.equals("-")) {
			System.out.println(a-b);
		}
		else if(c.equals("*")) {
			System.out.println(a*b);
		}
		else if(c.equals("/")) {
			System.out.println(a/b);
		}
		else {
			System.out.println("wrong number");
		}
         scanner.close();
	}

}
