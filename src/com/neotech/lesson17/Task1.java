package com.neotech.lesson17;

import java.util.Scanner;

public class Task1 {
	//reverse it
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String day=scanner.nextLine();
		for(int i=day.length()-1;i>=0;i--) {
			System.out.print(day.charAt(i)); 
			
		}System.out.println();
		
	}

}
