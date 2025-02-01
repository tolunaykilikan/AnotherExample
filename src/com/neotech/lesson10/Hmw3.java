package com.neotech.lesson10;

import java.util.Scanner;

public class Hmw3 {
/*Ask the user to enter an integer and build the following pattern:
Hint: Use scanner, if user entered number 5, there should be two parts
The first part, 1 to 5
The second part, 4 to 1
*/
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		
		if(number==5) {
			for(int i=1;i<=number;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
			for(int i=number-1;i>=1;i--) {
				for(int j=0;j<i;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
			else {
				for(int i=1;i<=number;i++) {
					for(int j=0;j<i;j++) {
						System.out.print(i);
					}
					System.out.println();
				
				}
			}
	}
}
	
	


