package com.neotech.lesson06;

public class Logicalnot {
public static void main(String[] args) {
	//! (not) it will negate/invert the value of boolean expression or variable
	//recall != (not equal )
	boolean var1=!true;//what is assigned is false
	System.out.println(var1);
	var1=!false;
	System.out.println(var1);
	int score=50;
	if(!(score<0 || score>100)) {
		System.out.println(score);
	}
	
}
}
