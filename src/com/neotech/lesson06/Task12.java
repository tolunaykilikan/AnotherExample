package com.neotech.lesson06;

import java.util.Scanner;

public class Task12 {
/* You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.*/
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the amount");
		Long money=scanner.nextLong();
		if(money<=200000) {
			System.out.println("lend the money");
		}
		else {
			System.out.println("reject the client");
		}

	}

}
