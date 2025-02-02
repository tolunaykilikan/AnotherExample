package com.neotech.lesson12;

import java.util.Scanner;

public class Taskkkk3 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("how many numbers");
	int size=scanner.nextInt();
	int [] array=new int[size];
	for(int i=0;i<array.length;i++) {
		System.out.println("please enter a number");
		int num=scanner.nextInt();
		array[i]=scanner.nextInt();
	}
	 
		
	}

}
