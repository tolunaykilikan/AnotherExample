package com.neotech.lesson12;

import java.util.Scanner;

public class hmwe2 {
//Create an array on integers and calculate the sum of all elements in an array.
	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<array.length;i++) {
			System.out.print("enter the numbers");
			array[i]=scanner.nextInt();
			sum+=array[i];
			System.out.print(sum);

		}System.out.println();
		
		

	}

}
