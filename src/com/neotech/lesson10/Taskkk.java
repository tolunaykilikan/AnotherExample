package com.neotech.lesson10;

import java.util.Scanner;

public class Taskkk {

	public static void main(String[] args) {
		//get input from the user then based on that print this structure
        //for ex:input=5
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the size of the pattern");
		int size=scanner.nextInt();
		for(int row=1;row<=size;row++) {
			for(int col=0;col<row;col++){
				System.out.print(row);
			}
			System.out.println();
		}
		for(int row=size-1;row>=1;row--) {
			for(int col=0;col<row;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
