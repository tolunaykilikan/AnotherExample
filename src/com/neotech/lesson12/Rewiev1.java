package com.neotech.lesson12;

public class Rewiev1 {

	public static void main(String[] args) {
		//1. initialization
		//2. check the condition
		//next iterations->1. incrementing; 2. check the condition
		
		for(int age=11;age<=20;age++) {
			if(age==13) {
				continue;
			}
			System.out.println(age);
		}

	}

}
